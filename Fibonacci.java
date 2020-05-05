package org.factorialYfibonacci;

public class Fibonacci {
    public int compute(int n, int k){ //siendo n número de meses y k el número de parejas de hijos que tiene cada pareja.
        int totalParejaConejos;
        // Los meses no pueden ser 0 ni negativo
        if (n < 1) {
            throw new RuntimeException("Número de meses no valido:" + n);
        }
        // EL número de hijos no puede ser negativo
        else if (k <0){
            throw new RuntimeException("Número de hijos no valido:" + k);
        }
        // Si el número de hijos es 0 siempre tendremos la pareja con la que se empieza el problema
        else if (k == 0){
            return 1;
        }
        // Si el mes es 1 o 2 siempre tendremos una única pareja que será la de inicio
        else if (n == 1 || n==2){
            return 1;
        }
        //Para el resto de casos
        else{
            int nParejasBBactual=0;
            int nParejasBBmesPasado=0;
            int nParejasAdulto=0;
            nParejasBBmesPasado=1;
            for(int i=1 ; i<n ; i++){
                nParejasBBactual=nParejasAdulto*k;
                nParejasAdulto=nParejasAdulto+nParejasBBmesPasado;
                nParejasBBmesPasado=nParejasBBactual;
            }
            totalParejaConejos = nParejasBBactual + nParejasAdulto;
            return totalParejaConejos;
        }
    }
}
