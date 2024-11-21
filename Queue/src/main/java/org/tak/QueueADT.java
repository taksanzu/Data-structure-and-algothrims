package org.tak;

public interface QueueADT<T> extends Iterable<T> {
    void enqueue(T element);
    T dequeue();
    T first();
    int size();
    boolean isEmpty();
    String toString();
    boolean equals(Object other);
}
