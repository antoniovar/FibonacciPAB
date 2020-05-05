package org.factorialYfibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    //Tests para la clase Fibonacci
    //Vamos a implementar 3 tests todos suponiendo que cada pareja de conejos tiene cada mes 3 parejas de conejos:
    //1. El número de meses es incorrecto: número de meses < 1, por lo que devuelve un error.
    //2. El numero de meses es 1: nos devuelve que en total hay 1 pareja de conejos.
    //3. El número de meses es 5: nos devuelve que en total hay 19 parejas de conejos.

    private Fibonacci fibonacci;

    @BeforeEach
    public void setup(){
        fibonacci = new Fibonacci();
    }
    @Test
    public void pruebaMesesMalDevuelveError(){
        assertThrows(RuntimeException.class, () -> fibonacci.compute(0,2));
    }
    @Test
    public void prueba1MesIgual1pareja(){
        Fibonacci fibonacci = new Fibonacci();
        int expectedValue = 1;
        long obtainedValue = fibonacci.compute(1,3);
        assertEquals(expectedValue,obtainedValue );
    }
    @Test
    public void prueba5MesesIgual19parejas(){
        Fibonacci fibonacci = new Fibonacci();
        int expectedValue = 19;
        long obtainedValue = fibonacci.compute(5,3);
        assertEquals(expectedValue,obtainedValue );
    }



}