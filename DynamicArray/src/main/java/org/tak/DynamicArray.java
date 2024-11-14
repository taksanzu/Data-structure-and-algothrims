package org.tak;

public class DynamicArray {
    private int[] data;
    private int size;

    public DynamicArray() {
        data = new int[1];
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }

    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        data[index] = value;
    }

    public void add(int value) {
        if (size == data.length) {
            int[] newData = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
        data[size] = value;
        size++;
    }

    public int size() {
        return size;
    }
}
