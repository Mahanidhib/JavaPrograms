package com.bridgelabz.datastructures;

import com.bridgelabz.util.AlgorithmProgram;
import com.bridgelabz.util.Functionalprogram;
import com.bridgelabz.util.QueueLinkedList;

public class CalenderQueue {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (month == 2 && Functionalprogram.leap(year)) {
			days[month] = 29;
		}
		System.out.println("\t\t " + months[month] + " " + year);
		System.out.println("Sunday Monday Tuesday Wednesday Thursday Friday Saturday");
		int dayofWeek = AlgorithmProgram.week(month, 1, year);
		QueueLinkedList<QueueLinkedList<Integer>> queue=new QueueLinkedList<QueueLinkedList<Integer>>();
		QueueLinkedList<Integer> refqueue=new QueueLinkedList<Integer>();
		
		
		for (int i = 1; i <= days[month]; i++) {
			refqueue.insert(i);
			if (((i + dayofWeek) % 7 == 0 || i==days[month]) ) {
				queue.insert(refqueue);
				refqueue=new QueueLinkedList<Integer>();
				continue;
			}
		}	
		for (int i = 0; i < dayofWeek; i++)
		System.out.print("\t");
		for(int i=0;i<=queue.getSize();i++)
		{
			QueueLinkedList<Integer> week=queue.remove();
			for(int j=0;j<week.getSize();j++)
			{
				System.out.print(week.remove()+"\t");
			}
			System.out.println();
		}

}

}
