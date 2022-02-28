package com.karim;

public class Main {

    public static void main(String[] args) {
        
    }

    // Task 1 "Complete the function that takes a non-negative integer n as input,
// and returns a list of all the powers of 2 with the exponent ranging from 0 to n (inclusive)."
    static class Kata {
        public static long[] powersOfTwo(int n) {
            long[] result = new long[n + 1];
            for (int i = 0; i <= n; i++) {
                result[i] = (long) Math.pow(2, i);
            }
            return result;
        }
    }
}