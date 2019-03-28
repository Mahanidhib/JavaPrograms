package com.bridgelabz.util;

public class Node<T> implements Comparable<T> {
	private T value;
	private Node<T> nextRef;
	public String key;
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}


	public Node<T> getNextRef() {
		return nextRef;
	}


	public void setNextRef(Node<T> nextRef) {
		this.nextRef = nextRef;
	}


	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
