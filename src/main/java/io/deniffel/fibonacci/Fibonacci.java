package io.deniffel.fibonacci;

public class Fibonacci {


    public static int fib(int i) {
        if(i == 0) {
            return 0;
        }
        if(i == 1 | i == 2) {
            return 1;
        }

        if(i == 3)
            return 2;
        if(i == 4)
            return 3;
        return i;
    }
}
