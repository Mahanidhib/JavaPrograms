

package com.bridgelabz.util;

import java.util.Scanner;

public class Functionalprogram {

	private static Scanner scan=new Scanner (System.in);
	
	public static int intModel()
	{
		return scan.nextInt();
		
	}
	
	public static String stringModel()
	{
		return scan.next();
		
	}
	//1.Replacing the String;
	public static void replace(String c) {
		
//		Scanner scan=new Scanner (System.in);
		System.out.println(" You Entered the String" +c);
		String msg= new String("Hello," +c+ "how are you");
		
	     if (c.length()>=3) {
	    	 System.out.println(msg);
			
		}
	     else {
	    	 
				System.out.println("invalid String");
	     }
	    System.out.println("enter proper name");
		String d= stringModel();
		System.out.println(msg.replace(c, d));
		
	}
	
	//2. Tossing Coin;
	
	public static void coins(int flips)
	{
		int count=1;
		double rs;
		int heads=0;
		int tails=0;
		while(count<=flips)
		{
			rs=Math.random();
			System.out.println(rs);
			if(rs<=.5)
			{
				heads++;
				
			}
			else
			{
				tails++;
			}
			count++;
		}
		System.out.println(tails);
		System.out.println(heads);
		System.out.println(flips);
		
		int headpercent=heads*100/flips;
		System.out.println("head percentage=" +headpercent);
		int tailpercent=tails*100/flips;
		System.out.println("tail percentage="+tailpercent);
	}
	//3.prime Factors;
	
	public static int primeFactors(int n) {
		for(int i=2;i>1;i++)
		{
			while(n%i==0)
			{
				System.out.println(i);
				n=n/i;
			}
		}
		return n;
	}
	//4.Harmonic;
	
	public static void demo(int n)
	{
		float a=1;
		for(int i=2; i<=n; i++)
		{
			a+=(float)1/i;
		}
		System.out.println(a);
	}
	
	//5. Leap Year
	
	public static int leap (int year)	
	{
		if(((year%4==0)&&(year%100!=0))||(year%400==0))
				{
			System.out.println("It is a leap year");
				}
		else {
			System.out.println("it is not a leap year");
		     }
		return year;
    }
	
	//6. Power of 2
	
	public static void  pow(int n)
	{
	int i=0;
	int power=1;
	if(n<31)
	{
		System.out.println("Power of 2 is less than 2^"+n);
		while(i<=n)
		{
			System.out.println("2^"+i+"="+power);
			power= power*2;
			i++;
		}
	}
	}
	
	// 7.Coupon
	
	
	public static int coupon(int n) {
		boolean[] isCollected = new boolean[n];

		int count = 0;
		int distinct = 0;
		while (distinct < n)
		{
			int value = (int) (Math.random() * n);
				count++;
			if (!isCollected[value])
			{
				distinct++;
				System.out.println(distinct);
				isCollected[value] = true;
			}
	    }
		return count;
		}
	
	//8.Gambler

	public static void gambler(int stake, int goal, int trial) {
		int wins = 0;
		int loss = 0;
		for (int i = 0; i < trial; i++) {
			int cash = stake;
			while (cash > 0 && cash < goal) 
			{
				if (Math.random() < 0.5)
					cash++;
					else 
					cash--;
			}
			if (cash == goal) 
				wins++;
				else 
				loss++;}
		System.out.println(wins + " wins of " + trial);
		System.out.println("Percent of games won= " + 100.0 * wins / trial);
		System.out.println("Percent of loss = " + 100.0 * loss / trial);
	}

	
	//Array2D
	public static void array2D(int r,int c,int arr[][])
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(+arr[i][j]+" ");
			}
			System.out.println( );
		}
	}

} 

	
	
	
	
	

	



