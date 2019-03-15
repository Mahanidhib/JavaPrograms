package com.bridgelabz.util;

import java.util.Arrays;

public class AlgorithmProgram {
	
	/**Input an Array;
	 * @return
	 */
	public static int[] arr()
	{
		int n=Functionalprogram.intModel();
		int[] arr =new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=Functionalprogram.intModel();
		}
	

		return arr;
	}
	/**1.Anagram
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean areAnagram(char[] str1,char[] str2)
	{
		int n1=str1.length;
		int n2=str2.length;
		
		if (n1!= n2)
			return false;
		
//		
//		Arrays.sort(str1);
//		Arrays.sort(str2);

		for(int i=0;i<n1;i++)
			if(str1[i]!=str2[i])
              return false;
		
		
		return true;
              
}
	/**2.Prime Number;
	 * @param s1
	 * @param s2
	 */
	public static void prime(int num1,int num2)
	{
		
	
	  for(int i = num1; i < num2; i++)
      {
		  int flag=0;
          for(int  j = 1; j <=i; j++)
          {
              if(i % j == 0)
              {
                  flag = flag+1;
                 
              }

       }
          if(flag == 2)
          {
              System.out.print(i+" ");
          }
      }
	  
}
	
	/**Bubble sort
	 * @param a
	 */
	public static void bubbleSort(int a[])
	{
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(int array:a) {
			System.out.println(array+ " ");
				}
			
		}
	
	
	
	
		/**INSERTION SORT FOR INTEGERS
		 * @param array
		 */
		public static void insertint(int[] array) 
		{
			int i=0,j=0,w,temp;
			for(i=0;i<array.length;i++)
			{
				for(j=0;j<=i;j++)
				{
					if(array[j]>array[i])
					{
						temp=array[j];
						array[j]=array[i];
						for(w=i;w>j+1;w--)
						    array[w]=array[w-1];	
	                    array[w]=temp;
				}
			}
		}
			for(int kl:array)
				System.out.print(kl + " ");
		}
		
		
		/**INSERTION SORT FOR STRING
		 * @param str
		 */
		public static void insertString(String str)
		{
			char[] array=str.toCharArray();
			int i=0,j=0,w;
			char temp;
			for(i=0;i<array.length;i++)
			{
				for(j=0;j<=i;j++)
				{
					if(array[j]>array[i])
					{
						 temp=array[j];
						array[j]=array[i];
						for(w=i;w>j+1;w--)
						    array[w]=array[w-1];	
	                    array[w]=temp;
				}
			}
		}
			
			for(int kl=0;kl<array.length;kl++)
				System.out.println( array[kl]+" ");
			
		}
		
		
		
		
		  /**Merge Sort Strings
		 * @param names
		 */
		public static void mergeSort(String[] names) {
		        if (names.length >= 2) {
		            String[] left = new String[names.length / 2];
		            String[] right = new String[names.length - names.length / 2];

		            for (int i = 0; i < left.length; i++) {
		                left[i] = names[i];
		            }

		            for (int i = 0; i < right.length; i++) {
		                right[i] = names[i + names.length / 2];
		            }

		            mergeSort(left);
		            mergeSort(right);
		            merge(names, left, right);
		        }
		    }

		    public static void merge(String[] names, String[] left, String[] right) {
		        int a = 0;
		        int b = 0;
		        for (int i = 0; i < names.length; i++) {
		            if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
		                names[i] = left[a];
		                a++;
		            } else {
		                names[i] = right[b];
		                b++;
		            }
		        }
		    }

		    
			/**Monthly Payment
			 * @param p
			 * @param y
			 * @param r
			 * @return
			 */
			public static double monthPayment(double p, double y, double r)
			{
				double n = 12 * y;
				double r0 = r / (12 * 100);
				double payment = p * r0 / (1 - Math.pow((1 + r0), -n));
				return payment;
			}
		
	}
	

