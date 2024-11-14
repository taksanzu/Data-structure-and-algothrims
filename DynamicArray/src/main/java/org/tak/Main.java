package org.tak;

public class Main {
    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray();

        arr.add(1);
        arr.add(2);
        arr.add(3);

        System.out.println(arr.get(0)); // 1

        arr.set(0, 4);

        System.out.println(arr.get(0)); // 4

        System.out.println(arr.size()); // 3

        arr.add(5);

        System.out.println(arr.size()); // 4

        System.out.println(arr.get(3)); // 5

        arr.add(6);
        arr.add(7);
        arr.add(8);

        System.out.println(arr.size()); // 7
    }
}