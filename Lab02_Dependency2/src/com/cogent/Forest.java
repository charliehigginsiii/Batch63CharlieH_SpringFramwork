package com.cogent;

public class Forest {
	private Tree tree;
	public Forest(Tree tree) {
		this.tree=tree;
	}
	public Forest() {
		
	}
	public Tree getTree() {
		return tree;
	}
	public void setTree(Tree tree) {
		this.tree = tree;
	}
	public void createTree() {
		tree.hasRoots();
		tree.hasTrunk();
		tree.hasBranches();
		tree.hasLeaves();
		System.out.println();
	}

}
