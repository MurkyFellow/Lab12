package com.mycompany.lab12;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author 000728303
 */
public class BST {

    class Node {

        int key;
        Node left, right, parent;

        public Node(int item, Node parent) {
            key = item;
            this.parent = parent;
        }
    }

    Node root;

    public BST() {
        this.root = null;
    }

    Node insert(Node root, int key) {
        if (root == null) {
            root = new Node(key, null);
            return root;
        }
        if (key < root.key) {
            root.left = insert(root.left, key);
            root.left.parent = root;
        } else if (key > root.key) {
            root.right = insert(root.right, key);
            root.right.parent = root;
        }
        return root;
    }

    public void add(Integer key) {
        root = insert(root, key);
    }

    public Iterator<Integer> iterator() {
        return new BSTIterator();
    }

    public class BSTIterator implements Iterator<Integer> {

        Node next = root;
        
        BSTIterator() {
            next = root;
            while (next.left != null) {
                next = next.left;
            }
        }
        
        @Override
        public boolean hasNext() {
            return (next != null);

        }

        @Override
        public Integer next() {
            Integer key = next.key;
            if (next.right != null) {
                next = next.right;
                while (next.left != null) {
                    next = next.left;
                }
                return key;
            }
            Node prev = next;
            next = next.parent;
            while (next != null && prev == next.right) {
                prev = next;
                next = next.parent;
            }
            return key;
        }

    }
}
