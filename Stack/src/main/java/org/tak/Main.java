package org.tak;

public class Main {
    public static void main(String[] args) {
        // Testing StackSimpleArray
        StackADT<Integer> stackSimpleArray = new StackSimpleArray<>(5);
        stackSimpleArray.push(1);
        stackSimpleArray.push(2);
        stackSimpleArray.push(3);
        stackSimpleArray.push(4);
        stackSimpleArray.push(5);

        System.out.println("StackSimpleArray:");

        System.out.println(stackSimpleArray.pop());

        System.out.println(stackSimpleArray.peek());

        System.out.println(stackSimpleArray.isEmpty());

        System.out.println(stackSimpleArray.isFull());

        // Testing StackDynamicArray
        StackADT<Integer> stackDynamicArray = new StackDynamicArray<>(2);

        stackDynamicArray.push(1);
        stackDynamicArray.push(2);

        System.out.println("StackDynamicArray:");

        stackDynamicArray.push(3);
        stackDynamicArray.push(4);

        System.out.println(stackDynamicArray.pop());

        System.out.println(stackDynamicArray.peek());
    }
}