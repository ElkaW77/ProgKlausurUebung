package Probeklausur.src.aufgabe2;

public class Node {

	private int number;

	private Node nextLeft;

	private Node nextRight;

	private String color;

	public Node(int number) {
		this.number = number;

	}

	public int getNumber() {
		return number;

	}

	public Node getLeft() {
		return nextLeft;

	}

	public void setLeft(Node node) {
		nextLeft = node;

	}

	public Node getRight() {
		return nextRight;

	}

	public void setRight(Node node) {
		nextRight = node;

	}

	public String getColor() {
		return color;

	}

	public void setColor(String color) {
		this.color = color;

	}

}