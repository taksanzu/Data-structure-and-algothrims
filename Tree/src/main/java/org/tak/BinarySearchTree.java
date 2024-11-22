package org.tak;

import java.util.Iterator;

public class BinarySearchTree<T extends Comparable<T>> implements TreeADT{
    int size;
    Node<T> root;

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int height() {
        return height(root);
    }

    @Override
    public boolean contains(Object element) {
        return contains(root, (T) element);
    }

    @Override
    public boolean add(Object element) {
        return false;
    }

    @Override
    public boolean remove(Object element) {
        return false;
    }

    @Override
    public Iterator traverse(TreeTraverseType type) {
        return null;
    }

    private int height(Node<T> node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(height(node.getLeft()), height(node.getRight()));
    }

    private boolean contains(Node<T> node, T element) {
        if (node == null) {
            return false;
        }
        if (node.getData().compareTo(element) == 0) {
            return true;
        }
        if (node.getData().compareTo(element) > 0) {
            return contains(node.getLeft(), element);
        }
        return contains(node.getRight(), element);
    }
}
