package com.karim;

public class Main {

    private static Object IllegalArgumentException;

    public static void main(String[] args) throws Throwable {
        int n = 5;
        int m = 20;
        if (m <= 0) {
            throw (Throwable) IllegalArgumentException;
        }
        int result = 0;
        for (int i = 0; i <= m; i = i + n) {
            result = result + i;
        }
        System.out.println(result);
    }

    // Task 1 "Complete the function that takes a non-negative integer n as input,
// and returns a list of all the powers of 2 with the exponent ranging from 0 to n (inclusive)."
    class Kata1 {
        public static long[] powersOfTwo(int n) {
            long[] result = new long[n + 1];
            for (int i = 0; i <= n; i++) {
                result[i] = (long) Math.pow(2, i);
            }
            return result;
        }
    }
}
// Task 2
// We need a function that can transform a number into a string.
//What ways of achieving this do you know?

class Kata2 {
    public static String numberToString(int num) {
        return Integer.toString(num);
    }
}
//Given a number n, return the number of positive odd numbers below n
class Kata3 {

    public static int oddCount(int n) {
        if (n % 2 == 0) {
            return n / 2;
        } else {
            return (n - 1) / 2;
        }
    }
}

