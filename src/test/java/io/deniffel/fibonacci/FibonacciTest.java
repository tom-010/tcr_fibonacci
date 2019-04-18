package io.deniffel.fibonacci;

import org.junit.Test;

import static io.deniffel.fibonacci.Fibonacci.fib;
import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    @Test
    public void zero_zero() {
        assertEquals(0, fib(0));
    }
}
