package com.Tree;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TreeNode drinks=new TreeNode("Drinks");
        TreeNode hot=new TreeNode("Hot");
        TreeNode cold=new TreeNode("Cold");
        TreeNode tea=new TreeNode("Tea");
        TreeNode coffee=new TreeNode("Coffee");
        TreeNode alcoholic=new TreeNode("Alcoholic");
        TreeNode nonAlcoholic=new TreeNode("Nonalcoholic");
        drinks.addChild(hot);
        drinks.addChild(cold);
        hot.addChild(tea);
        hot.addChild(coffee);
        cold.addChild(alcoholic);
        cold.addChild(nonAlcoholic);
        System.out.println(drinks.print(0));

    }
}
