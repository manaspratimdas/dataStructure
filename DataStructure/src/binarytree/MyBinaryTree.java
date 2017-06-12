package binarytree;

public class MyBinaryTree {

	public static void main(String[] args) {
		
		BinaryTree bt=new BinaryTree(10);
		
		bt.addNode(5);
		bt.addNode(17);
		bt.addNode(12);
		bt.addNode(6);
		bt.addNode(20);
		bt.addNode(4);
		bt.addNode(11);
		bt.addNode(13);
		System.out.println("MyBinaryTree" +bt);
		
		System.out.println("   "+bt.search(bt,100));
	//	bt.traversePreOrder();
	
		
	//	 bt.traverseInOrder();
	//	 bt.traversePostOrder();
		 

	}

}
