package com.bridgelabz.datastructures;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.AlgorithmProgram;
import com.bridgelabz.util.DataStructuresProgram;
import com.bridgelabz.util.QueueLinkedList;


public class PrimeOnQueue {
	
		public static void main(String[] args) {
		  	List<Integer> list = new ArrayList<Integer>();
		  	
		  	QueueLinkedList<Integer> queue=new QueueLinkedList<Integer>();
		  	
		  
	        list = AlgorithmProgram.isPrime(0,1000);
	        
	        for(int i=0;i<list.size();i++){
				  for(int j=i+1;j<list.size();j++){
					  
					
					  if(DataStructuresProgram.isAnagram(String.valueOf(list.get(i)),String.valueOf( list.get(j)))){
						  
						  queue.insert(list.get(i));
						  queue.insert(list.get(j));
					}
				}
			}
	        System.out.println("Elements in a queue are :");
	        queue.display();
	}
}