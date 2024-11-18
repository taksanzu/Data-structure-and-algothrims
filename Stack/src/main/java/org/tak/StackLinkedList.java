package org.tak;

public class StackLinkedList<T> implements StackADT<T> {
    private Node<T> top;
    private int size;

    public StackLinkedList() {
        this.top = null;
        this.size = 0;
    }

    private static class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    @Override
    public void push(T value) {
        Node<T> node = new Node<>(value);
        node.next = top;
        top = node;
        size++;
    }

    @Override
    public T pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return null;
        } else {
            T value = top.value;
            top = top.next;
            size--;
            return value;
        }
    }

    @Override
    public T peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return top.value;
        }
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
