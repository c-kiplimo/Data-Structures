package com.BST;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinarySearchTree newBST=new BinarySearchTree();
        newBST.insert(70);
        newBST.insert(50);
        newBST.insert(80);
        newBST.insert(90);
        newBST.insert(40);
        newBST.insert(30);
        newBST.insert(23);
        newBST.insert(67);
        newBST.search(newBST.root, 70);

    }
}
