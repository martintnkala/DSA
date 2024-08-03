package com.marvian.BST.InOrderTraversal;

public class Tree {

    private TreeNode root;

    void insert(int data) {
        if (root == null) {
            root = new TreeNode(data);
        }
        root.insert(data);
    }

    void traverseInOrder(){
        if (root != null) {
            root.traverseInOrder();
        }
    }
}
