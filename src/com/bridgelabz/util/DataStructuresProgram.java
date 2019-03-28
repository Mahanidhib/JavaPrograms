package com.bridgelabz.util;

//import com.bridgelabz.StackImplementation;

public class DataStructuresProgram {
	  @SuppressWarnings("rawtypes")
	public static boolean areParenthesisBalanced(char[] ch) {

			StackImplementation st = new StackImplementation();

			for (int i = 0; i < ch.length; i++) {
				if (ch[i] == '{' || ch[i] == '(' || ch[i] == '[')
					st.push(ch[i]);

				if (ch[i] == '}' || ch[i] == ')' || ch[i] == ']') {

					if (st.isEmpty()) {
						return false;
					}

					else if (!isMatchingPair(st.pop(), ch[i])) {
						return false;
					}
				}

			}

			if (st.isEmpty())
				return true;
			else {
				return false;
			}
		}
	    static boolean isMatchingPair(char character1, char character2) {
			if (character1 == '(' && character2 == ')')
				return true;
			else if (character1 == '{' && character2 == '}')
				return true;
			else if (character1 == '[' && character2 == ']')
				return true;
			else
				return false;
		}

}
