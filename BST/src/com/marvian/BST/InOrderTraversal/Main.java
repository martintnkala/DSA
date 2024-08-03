package com.marvian.BST.InOrderTraversal;

public class Main {
    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.insert(30);
        tree.insert(40);
        tree.insert(20);
        tree.insert(23);
        tree.insert(24);
        tree.insert(70);
        tree.insert(10);
        tree.insert(11);

        tree.traverseInOrder();
    }
}