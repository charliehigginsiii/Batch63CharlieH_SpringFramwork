package com.cogent;

public class Manager {
	public static void main(String[]args) {
		Tree tree=new Tree();
		
		Forest forest=new Forest(tree);
		forest.createTree();
		forest.createTree();
		
	}

}
