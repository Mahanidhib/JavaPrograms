

package com.bridgelabz.util;

import java.util.Scanner;

/**
 * @author Mahanidhi
 *
 */
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
	public static double doubleModel()
	{
		return scan.nextDouble();
	}
	
	/**1.Replacing the String;
	 * @param c
	 */
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
	
	
	/**2. Tossing Coin;
	 * @param flips
	 */
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
	
	/**3.prime Factors;
	 * @param n
	 * @return
	 */
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
	
	/**4.Harmonic;
	 * @param n
	 */
	public static void demo(int n)
	{
		float a=1;
		for(int i=2; i<=n; i++)
		{
			a+=(float)1/i;
		}
		System.out.println(a);
	}
	
	
	/**5. Leap Year
	 * @param year
	 * @return
	 */
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
	
	
	/**6. Power of 2
	 * @param n
	 */
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
	
	
	
	/**7.Coupon
	 * @param n
	 * @return
	 */
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
	
	

	/**8.Gambler
	 * @param stake
	 * @param goal
	 * @param trial
	 */
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

	
	
	/**9.Array2D
	 * @param r
	 * @param c
	 * @param arr
	 */
	public static void array2D(int r,int c,Object arr[][])
	{
		System.out.println("enter the values");
		for(int i=0; i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				
				arr[i][j]=Functionalprogram.stringModel();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println( );
		}
		}
		
	
		
			// Prints all triplets in arr[] with 0 sum 
		/**10.Sum of three digits
		 * @param n
		 * @param arr
		 */
		public static void findTriplets(int n,int arr[]) 
			{ 
			  
			    for (int i=0; i<n-2; i++) 
			    { 
			        for (int j=i+1; j<n-1; j++) 
			        { 
			            for (int k=j+1; k<n; k++) 
			            { 
			                if (arr[i] + arr[j]+arr[k] == 0) 
			                { 
			                    System.out.print(arr[i]); 
			                    System.out.print(" "); 
			                    System.out.print(arr[j]); 
			                    System.out.print(" "); 
			                    System.out.print(arr[k]); 
			                    System.out.print("\n"); 
			            
			                } 
			                else {
			                	 System.out.println(" not exist "); 
			                }
			            } 
			        } 
			    } 
			    
		
			       
			    
			  
			} 
		
		
		
/**11. Quadratic Equation
 * @param a
 * @param b
 * @param c
 */

public static void roots(int a, int b, int c) {
	int quad=(b*b)-(4*a*c);
	if(quad>0)
	{
		double root1=(-b+Math.sqrt(quad))/(2*a);
		double root2=(-b-Math.sqrt(quad))/(2*a);
		System.out.println("Roots are distinct"+" "+"root=" +root1+ "root2=" +root2);
	}
		else if (quad==0) {
			double root3=(-b)/(2*a);
			double root4 = root3;
			System.out.println("Roots are eual"+ " "+"root="+root3);
		}
			else if(quad<0) {
				double real=(-b)/(2*a);
				double imagi=Math.sqrt(-quad)/(2*a);
				System.out.println("Roots are real and imaginary");
				System.out.println(real + "+i"+imagi);
				System.out.println(real + "-i"+imagi);

			}
			
	
}


/**12.Distance
 * @param x
 * @param y
 */
public static void origin(int x,int y)
{
	double a=Math.sqrt((x*x)+(y*y));
			System.out.println(a);
}



/**13.Stop Watch
 * @param l
 * @param s
 */
public static long watch(long l,long s)
{
	long elapsTime=s-l;
	return elapsTime;
}


/**14.Wind Chill
 * @param t
 * @param v
 */
public static double wind(double t, double v)

{
	double w=35.74+0.6215*t + (0.4275*t - 35.74)*Math.pow(v,0.16);
	return w;
	
}




/**Tick Tact Toe;
 * @param b
 * @return
 */

// Return an X or O, depending upon whose move it was


static final int USER = 1;
static final int EMPTY = 0;
  	static final int NONE = 0;
    
      static final int COMPUTER = 2;
static final int STALEMATE = 3;


public static char printChar(int b) {
	switch(b) {
	case EMPTY:
	    return ' ';
	case USER:
	    return 'X';
	case COMPUTER:
	    return 'O';
	}
	return ' ';
    }

    // See if the game is over
    public static int checkWinner(int[][] board) {
	// Check if someone won
	// Check horizontals

	// top row
    	
	if((board[0][0] == board[0][1]) && (board[0][1] == board[0][2]))
	    return board[0][0];

	// middle row
	if((board[1][0] == board[1][1]) && (board[1][1] == board[1][2]))
	    return board[1][0];

	// bottom row
	if((board[2][0] == board[2][1]) && (board[2][1] == board[2][2]))
	    return board[2][0];

	// Check verticals

	// left column
	if((board[0][0] == board[1][0]) && (board[1][0] == board[2][0]))
	    return board[0][0];

	// middle column
	if((board[0][1] == board[1][1]) && (board[1][1] == board[2][1]))
	    return board[0][1];

	// right column
	if((board[0][2] == board[1][2]) && (board[1][2] == board[2][2]))
	    return board[0][2];

	// Check diagonals
	// one diagonal
	if((board[0][0] == board[1][1]) && (board[1][1] == board[2][2]))
	    return board[0][0];

	// the other diagonal
	if((board[0][2] == board[1][1]) && (board[1][1] == board[2][0]))
	    return board[0][2];

	// Check if the board is full
	if(board[0][0] == EMPTY || 
           board[0][1] == EMPTY || 
           board[0][2] == EMPTY || 
	   board[1][0] == EMPTY ||
	   board[1][1] == EMPTY ||
	   board[1][2] == EMPTY ||
	   board[2][0] == EMPTY ||
	   board[2][1] == EMPTY ||
	   board[2][2] == EMPTY)
	    return NONE;

	return STALEMATE;
    }

    // Generate a random computer move
    public static int computer_move(int[][] board) {
	int move = (int)(Math.random()*9);

	while(board[move/3][move%3] != EMPTY) 
	    move = (int)(Math.random()*9);

	return move;
    }
    
}








	


		
	
	


 

	
	
	
	
	

	



