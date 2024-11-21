package org.tak;

public class Main {
    public static void main(String[] args) {
        System.out.println(binaryGap(5));// 2
    }
    public static int binaryGap(int N) {
        int max = 0;
        int count = 0;
        boolean start = false;

        while (N > 0) {
            if (N % 2 == 1) {
                if (start) {
                    max = Math.max(max, count);
                }
                start = true;
                count = 1;
            } else if (start) {
                count++;
            }
            N = N >> 1;
        }
        return max;
    }
}