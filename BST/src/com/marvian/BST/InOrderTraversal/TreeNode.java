package com.marvian.BST.InOrderTraversal;

public class TreeNode {

    private int value;
    private TreeNode left;
    private TreeNode right;

    // Insert Method
    void insert(int data) {
        if (this.value == data) {
            return;
        }
        if (data < this.value) {
            if (this.left == null) {
                this.left = new TreeNode(data);
            }
            this.left.insert(data);
        }
        else{
            if (this.right == null) {
                this.right = new TreeNode(data);
            }
            this.right.insert(data);
        }

    }

    void traverseInOrder(){
        if (this.left != null) {
            this.left.traverseInOrder();
        }
        System.out.print(this.value + " ");

        if (this.right != null) {
            this.right.traverseInOrder();
        }
    }

    // Constructor
    public TreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
