package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.List;

//import com.bridgelabz.StackImplementation;

public class DataStructuresProgram {
	  /**Balanced Parenthesis
	 * @param ch
	 * @return
	 */
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

	    
	    
	    /**Binary Tree
	     * @param n
	     * @param k
	     * @return
	     */
	    public static double binomialCoeff(double n, double k) {
			int res = 1;
		    if (k > n - k) 
		        k = n - k;  
			for (int i = 0; i < k; ++i) {
				res *= (n - i);
				res /= (i + 1);
			}
			return res;
		}
		
		public static double binaryCount(double n) {
			double c = binomialCoeff(2 * n, n);
			double count = c / (n + 1);
			return count;
	}
		/**
		 *Static function to check if the two strings are anagram or not.
		 * @param <T>
		 * 
		 * @param str1 the string to be checked for anagram
		 * @param str2 the string to be checked for anagram
		 * @return true if the strings are anagram else false
		 */
		public static boolean isAnagram(String str1,String str2) {
			char[] array1=str1.toCharArray();
			char temp1,temp2;
			char[] array2=str2.toCharArray();
			int len1=str1.length();
			int len2=str2.length();
			if(len1!=len2) {
				return false;
			}
			else{
				for(int i=0;i<len1;i++){
					for(int j=0;j<len1-1;j++){
						if(array1[j]>array1[j+1]){
							temp1=array1[j];
							array1[j]=array1[j+1];
							array1[j+1]=temp1;
						}
					}
				}
				for(int i=0;i<len2;i++){
					for(int j=0;j<len2-1;j++){
						if(array2[j]>array2[j+1]){
							temp2=array2[j];
							array2[j]=array2[j+1];
							array2[j+1]=temp2;
						}
					}
				}
				str1=String.valueOf(array1);
				str2=String.valueOf(array2);
				if(str1.equals(str2))
					return true;
				else
					return false;
			}	
		}

	
		/**Prime Anagram
		 * @param new_lst
		 * @return
		 */
		public static List<Integer> anagramPrime(List<Integer> new_lst){
			List<Integer> listOfAnagrams=new ArrayList<Integer>();
			for(int i=0;i<new_lst.size();i++){
				for(int j=i+1;j<new_lst.size();j++){
					if(isAnagram(String.valueOf(new_lst.get(i)),String.valueOf( new_lst.get(j)))){
						listOfAnagrams.add(new_lst.get(i));
						listOfAnagrams.add(new_lst.get(j));
						System.out.println(new_lst.get(i)+"  "+new_lst.get(j));
					}
				}
			}
			return listOfAnagrams;
		}

		/**
		 * Function that prints the list of prime numbers that are anagram 
		 * 
		 * @param list of prime numbers that anagram 
		 */
		public static void printPrimeAndAnagram(List<List<Integer>> list)
		{
		    List<Integer> aList = new ArrayList<Integer>();
		    for (int i = 0; i < list.size(); i++) {
		        aList = list.get(i);
		        if (i == 0) {
		            System.out.println("Numbers which are prime and anagram are:"+aList.size());
		            System.out.println();
		            for (int j = 0; j < aList.size(); j++) {
		                System.out.print(aList.get(j) + " ");
		            }
		        } else {
		            System.out.println("Numbers which are prime but not anagram are:"+aList.size());
		            System.out.println();
		            for (int j = 0; j < aList.size(); j++) {
		                System.out.print(aList.get(j) + " ");
		            }
		        }
		        System.out.println();
		    }
		}
		
}
