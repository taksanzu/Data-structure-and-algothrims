package org.tak;

public class Main {
    public static void main(String[] args) {
        //Test linked list
        LinkedListCustom linkedList = new LinkedListCustom();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        linkedList.print();

        linkedList.remove(2);

        linkedList.print();

        System.out.println("Size: " + linkedList.size());

        linkedList.remove(1);

        linkedList.print();
    }
}