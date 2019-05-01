package com.bridgelabz.stockAccountModel;

import java.util.HashMap;

public class HashMapDemo {
public static void main(String[] args) {
	HashMap m= new HashMap();
	m.put(101, "abc");
	m.put(102,"xyz");
	//System.out.println(m);
	System.out.println(m.put(101, "mnc"));
	System.out.println(m);
}
}
