package org.tak;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class CircularArraysBaseQueue<T> implements QueueADT<T>{

    @Override
    public void enqueue(T element) {

    }

    @Override
    public T dequeue() {
        return null;
    }

    @Override
    public T first() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        QueueADT.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return QueueADT.super.spliterator();
    }
}
