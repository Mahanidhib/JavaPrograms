package com.bridgelabz.util;

import java.util.Arrays;

public class AlgorithmProgram {
	
	
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
		
		
		Arrays.sort(str1);
		Arrays.sort(str2);

		for(int i=0;i<n1;i++)
			if(str1[i]!=str2[i])
              return false;
		
		
		return true;
              
}
	/**2.Prime Number;
	 * @param s1
	 * @param s2
	 */
	public static void prime(int s1,int s2)
	{
		int flag=0;
	
	  for(int i = s1; i <= s2; i++)
      {
          for(int  j = 2; j < i; j++)
          {
              if(i % j == 0)
              {
                  flag = 0;
                  break;
              }
              else
              {
                  flag = 1;
              }
          }
          if(flag == 1)
          {
              System.out.println(i);
          }
      }
	  
}
	
	

	
}
