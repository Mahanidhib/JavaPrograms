package com.bridgelabz.datastructures;

import com.bridgelabz.util.Dequeue;
import com.bridgelabz.util.Functionalprogram;

public class DequePallindrome {

	static boolean ispallindrom(Dequeue<Character> dq) {
		if (dq.size() % 2 == 0) {
			while (dq.size() != 0) {
				char c = dq.removeFront();
				char c2 = dq.removeRear();
				if (c != c2) {
					return false;
				}
			}
		} else {
			while (dq.size() == 1) {
				char c = dq.removeFront();
				char c2 = dq.removeRear();
				if (c != c2) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("enter a string");
		String s1=Functionalprogram.getInputString();
		Dequeue<Character> dq = new Dequeue<>();
		int i = 0;
		while (i < s1.length()) {
			dq.addRear(s1.charAt(i++));
		}
		System.out.println(dq + " " + dq.size());
		System.out.println(ispallindrom(dq));
	}
}