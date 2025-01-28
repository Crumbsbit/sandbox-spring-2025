package org.example.sandbox.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @Test
    void testFibonacci() {
        assertEquals(0, Algorithms.fibonacci(0));
        assertEquals(1, Algorithms.fibonacci(1));
        assertEquals(1, Algorithms.fibonacci(2));
        assertEquals(2, Algorithms.fibonacci(3));
        assertEquals(3, Algorithms.fibonacci(4));
        assertEquals(5, Algorithms.fibonacci(5));
        assertEquals(55, Algorithms.fibonacci(10));
    }

    @Test
    void testFibonacciRecursive() {
        assertEquals(0, Algorithms.fibonacciRecursive(0));
        assertEquals(1, Algorithms.fibonacciRecursive(1));
        assertEquals(1, Algorithms.fibonacciRecursive(2));
        assertEquals(2, Algorithms.fibonacciRecursive(3));
        assertEquals(3, Algorithms.fibonacciRecursive(4));
        assertEquals(5, Algorithms.fibonacciRecursive(5));
        assertEquals(55, Algorithms.fibonacciRecursive(10));
    }

    @Test
    void testFibonacciNegative() {
        assertThrows(IllegalArgumentException.class, () -> Algorithms.fibonacci(-1));
    }

    @Test
    void testFibonacciRecursiveNegative() {
        assertThrows(IllegalArgumentException.class, () -> Algorithms.fibonacciRecursive(-1));
    }
}