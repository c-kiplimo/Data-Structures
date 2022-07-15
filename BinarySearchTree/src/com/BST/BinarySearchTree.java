package com.BST;

import org.w3c.dom.Node;

public class BinarySearchTree {
    BinaryNode root;
    BinarySearchTree(){
        root=null;
    }
    private  BinaryNode insert(BinaryNode currentNode,int value){
   if (currentNode==null){
       BinaryNode newNode=new BinaryNode();
       newNode.value=value;
       System.out.println("The Value successfully inserted");
       return  newNode;
   }
   else if (value<=currentNode.value){
       currentNode.left=insert(currentNode.left,value);
       return  currentNode;


   }
   else {
       currentNode.right=insert(currentNode.right,value);
       return  currentNode;
   }
    }
    void insert(int value){
      insert(root,value);
    }
    BinaryNode search(BinaryNode node,int value){
        if (node==null){
            System.out.println("Value "+value+" not found in BST");
            return  null;
        }
        else  if (node.value==value){
            System.out.println("Value "+value+ " found in BST");
            return node;
        }
        else if (value<node.value){
            return search(node.left,value);

        }
        else {
            return  search(node.right, value);
        }
    }
}

