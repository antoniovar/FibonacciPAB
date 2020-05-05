package org.factorialYfibonacci;

public class Fibonacci {
    public int compute(int n, int k){ //siendo n número de meses y k el número de parejas de hijos que tiene cada pareja.
        int totalConejos;
        if (n < 1 || k<1 ) {
            throw new RuntimeException("Número de meses no valido:" + n);
        }
        else if (n == 1 || n==2){
            return 1;
        }
        else{
            int nBBactual=0;
            int nBBmesPasado=0;
            int nAdulto=0;
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
