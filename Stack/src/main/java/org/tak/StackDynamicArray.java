package org.tak;

public class StackDynamicArray<T> implements StackADT<T> {
    private T[] stack;
    private int top;
    private int size;

    public StackDynamicArray(int size) {
        this.size = size;
        this.stack = (T[]) new Object[size];
        this.top = -1;
    }

    @Override
    public void push(T value) {
        if (top == size - 1) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = value;
        }
    }

    @Override
    public T pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return stack[top--];
        }
    }

    @Override
    public T peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return stack[top];
        }
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == size - 1;
    }
}
