package org.tak;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = 10;
        for (int i = 0; i < n; i++) {
            list.add(finbonacci(i));
        }
        System.out.println("Fibonacci series of " + n + " numbers:");
        System.out.println(list);

        System.out.println("Factorial of " + n + ": " + factorial(n));
    }

    public static int finbonacci(int n) {
        return n < 2 ? 1 : finbonacci(n - 1) + finbonacci(n - 2);
    }

    public static int factorial(int n) {
        return n == 0 ? 1 : n * factorial(n - 1);
    }
}