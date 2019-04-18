package io.deniffel.fibonacci;

import org.junit.Test;

import static io.deniffel.fibonacci.Fibonacci.fib;
import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void zero_zero() {
        assertEquals(0, fib(0));
    }

    @Test
    public void one_one() {
        assertEquals(1, fib(1));
    }

    @Test
    public void two_one() {
        assertEquals(1, fib(2));
    }

    @Test
    public void three_two() {
        assertEquals(2, fib(3));
    }

    @Test
    public void four_three() {
        assertEquals(3, fib(4));
    }

    // 0, 1, 2, 3, 4, 5, 6, 7
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

}
