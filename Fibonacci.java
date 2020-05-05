package org.factorialYfibonacci;

public class Fibonacci {
    int nBBactual=0;
    int nBBmesPasado=0;
    int nAdulto=0;

    public int compute(int n, int k){ //siendo n número de meses y k el número de parejas de hijos que tiene cada pareja.
        int totalConejos;
        if (n < 1) {
            throw new RuntimeException("Número de meses no valido:" + n);
        }
        else if (n == 1){
            nBBactual = 1 ;
            nAdulto = 0;
            return totalConejos = nBBactual + nAdulto;
        }
        else{
            nBBmesPasado=1;
            for(int i=1 ; i<n ; i++){
                nBBactual=nAdulto*3;
                nAdulto=nAdulto+nBBmesPasado;
                nBBmesPasado=nBBactual;
            }
            totalConejos = nBBactual + nAdulto;
            return totalConejos;
        }
    }
}
