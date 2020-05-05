package org.factorialYfibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    //Tests para la clase Fibonacci
    //Vamos a implementar 5 tests todos suponiendo que cada pareja de conejos tiene cada mes 3 parejas de conejos:
    //1. El número de meses es incorrecto: número de meses < 1, por lo que devuelve un error.
    //2. El numero de meses es 1: nos devuelve que en total hay 1 pareja de conejos.
    //3. El número de meses es 5: nos devuelve que en total hay 19 parejas de conejos.
    //4. El número de hijos es incorrecto: número de hijos < 0, por lo que devuelve un error.
    //5. El número de hijos es 0: En este caso siempre tendremos 1 pareja de conejos
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
        int obtainedValue = fibonacci.compute(1,3);
        assertEquals(expectedValue,obtainedValue );
    }
    @Test
    public void prueba5MesesIgual19parejas(){
        Fibonacci fibonacci = new Fibonacci();
        int expectedValue = 19;
        int obtainedValue = fibonacci.compute(5,3);
        assertEquals(expectedValue,obtainedValue );
    }
    @Test
    public void pruebaHijosMalDevuelveError(){
        assertThrows(RuntimeException.class, () -> fibonacci.compute(5,-1));
    }
    @Test
    public void pruebaHijos0DevuelveSiempre1(){
        Fibonacci fibonacci = new Fibonacci();
        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(5,0);
        assertEquals(expectedValue, obtainedValue);
    }



}