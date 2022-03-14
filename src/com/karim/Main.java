package com.karim;

public class Main {

    private static Object IllegalArgumentException;

    public static void main(String[] args) throws Throwable {
        int a = 2;
        int b = 4;
        int[] result = new int[b - a + 1];
        for (int i = a; i <= b; i++) {
            result[i-a] = i;
            System.out.print(result[i-a]+" ");
        }
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
//Task 4:Complete the function that takes two integers (a, b, where a < b)
// and return an array of all integers between the input parameters, including them.
class Kata4 {

    public static int[] between(int a, int b) {
        int[] result = new int[b-a+1];
        for(int i = a; i<=b;i++){
            result[i-a]=i;
        }
        return result;
    }
}
