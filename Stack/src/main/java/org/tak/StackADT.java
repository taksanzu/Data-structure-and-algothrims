package org.tak;

public interface StackADT<T> {
    void push(T value);
    T pop();
    T peek();
    boolean isEmpty();
    boolean isFull();
}
