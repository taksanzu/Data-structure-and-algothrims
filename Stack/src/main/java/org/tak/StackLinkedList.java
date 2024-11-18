package org.tak;

public class StackLinkedList {
    private Node top;
    private int size;

    public StackLinkedList() {
        this.top = null;
        this.size = 0;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int value = top.value;
            top = top.next;
            size--;
            return value;
        }
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return top.value;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public boolean isFull() {
        return false;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}
