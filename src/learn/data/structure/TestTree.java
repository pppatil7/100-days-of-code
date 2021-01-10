package learn.data.structure;

public class TestTree {

	public static void main(String[] args) {
		Tree tree=new Tree();
		tree.root.data=10;
		tree.root.left.data=20;
		tree.root.right.data=30;
		tree.root.left.left.data=40;
		System.out.println(tree.root.right.data);
		
	}
}