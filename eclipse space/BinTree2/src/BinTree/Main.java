package BinTree;

public class Main {
	public static void main(String[] args){
		BinTreeShixian tree=new BinTreeShixian();
		
		tree.insertRoot("A");
		tree.insertLeft(tree.root(),"c");
		TreeNode node=tree.insertRight(tree.root(), "b");
		tree.insertLeft(node, "h");
		node=tree.insertRight(node, "M");
		
		tree.PerorderTraverse();
		System.out.println("\n");
		
		tree.InorderTraverse();
		System.out.println("\n");
		
		tree.postOrderTraverse();
		
		
		
		
		
		
	}

}
