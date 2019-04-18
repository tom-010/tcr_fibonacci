package io.deniffel.fibonacci;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    @Test
    public void zero_zero() {
        assertEquals(0, Fibonacci.fib(0));
    }
}
