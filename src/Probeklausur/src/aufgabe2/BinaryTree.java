package Probeklausur.src.aufgabe2;

public class BinaryTree {
	private Node root;

	public void add(int number) {
		if (root == null) {
			root = new Node(number);
		} else {
			add(number, root);
		}
	}

	private void add(int number, Node node) {
		if (number < node.getNumber()) {
			if (node.getLeft() == null) {
				node.setLeft(new Node(number));
			} else {
				add(number, node.getLeft());
			}
		} else if (number > node.getNumber()) {
			if (node.getRight() == null) {
				node.setRight(new Node(number));
			} else {
				add(number, node.getRight());
			}
		}
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.add(13);
		tree.add(19);
		tree.add(49);
		tree.add(14);
		tree.add(8);
		tree.add(12);
		tree.add(1);
		tree.add(3);
		tree.add(17);
		tree.add(29);
	}

	public void print() {
		print(root);
	}

	private void print(Node node) {

	}

	public int numberOfNodes() {
		return numberOfNodes(root);
	}

	private int numberOfNodes(Node node) {
		return 0;
	}
}