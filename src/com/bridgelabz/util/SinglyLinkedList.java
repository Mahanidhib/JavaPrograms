package com.bridgelabz.util;

public class SinglyLinkedList<T> {
	private Node<T> head;
	private Node<T> tail;
	private int size = 0;
	private String key;
	static String[] str = new String[100];
	static SinglyLinkedList newList = new SinglyLinkedList();

	public boolean isEmpty() {
		return head == null;
	}
	public void add(T data) {
		Node<T> nd = new Node<T>();

		nd.setValue(data);

		System.out.println("Adding: " + data);
		if (isEmpty()) {
			head = nd;
			tail = nd;
		} else {
			tail.setNextRef(nd);
			tail = nd;
		}
	}

	public boolean search(T data) {
		Node<T> temp = head;

		while (temp.getNextRef() != null) {

			if (data.equals(temp.getValue())) {
				return true;
			}
			temp = temp.getNextRef();
		}
		return false;
	}


	public void traverse() {

		Node<T> tmp = head;
		while (true) {
			if (tmp == null) {
				break;
			}
			System.out.println(tmp.getValue());
			tmp = tmp.getNextRef();
		}

	}

	@Override
	public String toString() {
		Node<T> temp = head;
		String elements = "";
		while (temp.getNextRef() != null) {
			elements += " " + temp.getValue() + " ";
			temp = temp.getNextRef();
		}
		return elements + temp.getValue();
	}

	public void get() {

		Node<T> tmp = head;
		int k = 0;
		while (true) {
			if (tmp == null) {
				break;
			}
			str[k] = String.valueOf(tmp.getValue());
			k++;
			tmp = tmp.getNextRef();
		}
	}

	public SinglyLinkedList<T> searchKey(SinglyLinkedList<T> list, String key) {
		Node<T> current = head;
		boolean status = false;

		for (int i = 0; i <= str.length - 1; i++) {
			if (str[i] != null && str[i].equals(key)) {
				status = true;
				str[i] = null;
				current = current.getNextRef();
				break;
			}
		}
		for (int i = 0; i < str.length; i++) {
			if (str[i] != null)
				newList.add(str[i]);
		}
		if (status) {
			System.out.println("Element is present in the list ");
		} else {
			System.out.println("Element is not present in the list ");
			newList.add(key);
		}

		return newList;
	}
	
	public String[] convArray(String[] array) {
		Node<T> tnode = head;
		int i = 0;
		while (tnode != null) {
			array[i] = String.valueOf(tnode.getValue());
			tnode = tnode.getNextRef();
			i++;
		}
		return array;
	}

	public int[] convertIntArray(String[] arr) {
		int[] arrInt = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arrInt[i] = Integer.valueOf(arr[i]);
		}
		return arrInt;
	}

	public int[] sort(int[] array) {
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

	public void printList() {
		Node<T> tnode = head;
		while (tnode != null) {
			System.out.print(tnode.getValue() + " ");
			tnode = tnode.getNextRef();
		}
	}
	public int size() {
		Node<T> tnode = head;
		int len = 0;
		while (tnode != null) {
			len++;
			tnode = tnode.getNextRef();
		}
		return len;
	}
	
	
	}

