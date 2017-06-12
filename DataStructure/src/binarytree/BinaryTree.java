package binarytree;

public class BinaryTree {

	private int id;
	private BinaryTree left;
	private BinaryTree right;

	public BinaryTree(int id) {
		super();
		this.id = id;

	}

	public void addNode(int id) {

		if (id < this.id) {
			if (this.left != null) {
				this.left.addNode(id);
			} else {
				this.left = new BinaryTree(id);
			}

		} else {
			if (this.right != null) {
				this.right.addNode(id);
			} else {
				this.right = new BinaryTree(id);
			}

		}

	}

	/**
	 * The algorithm search for the element in binary tree
	 */

	public BinaryTree search(BinaryTree tree, int key) {

		if (tree==null|| key == tree.id) {
			return tree;
		}

		if (key < tree.id) {

			return search(tree.left, key);
		}
		if (key > tree.id) {
			return search(tree.right, key);

		}
		return tree;

	}

	/**
	 * Traverse node, left subtree then right subtree
	 */
	public void traversePreOrder() {

		System.out.println(id);
		if (this.left != null) {

			this.left.traversePreOrder();
		}

		if (this.right != null) {

			this.right.traversePreOrder();
		}
	}

	/**
	 * traverse left, node then right node
	 */
	public void traverseInOrder() {

		if (this.left != null) {
			this.left.traverseInOrder();
		}
		System.out.println(id);
		if (this.right != null) {
			this.right.traverseInOrder();
		}
	}

	/**
	 * Traverse left, right and then node
	 */
	public void traversePostOrder() {

		if (this.left != null) {
			this.left.traversePostOrder();
		}
		if (this.right != null) {
			this.right.traversePostOrder();
		}
		System.out.println(id);
	}

	@Override
	public String toString() {
		return "BinaryTree [id=" + id + ", left=" + left + ", right=" + right + "]";
	}

}
