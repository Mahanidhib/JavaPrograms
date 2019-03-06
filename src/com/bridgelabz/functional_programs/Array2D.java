package com.bridgelabz.functional_programs;

import com.bridgelabz.util.Functionalprogram;

public class Array2D {

	public static void main(String[] args) {
		System.out.println("rows");
				int r=Functionalprogram.intModel();
				System.out.println("columns");
				int c=Functionalprogram.intModel();
				int arr[][]=new int[r][c];
				for(int i=0; i<r;i++)
				{
					for(int j=0;j<c;j++)
					{
						System.out.println("enter the values");
						arr[i][j]=Functionalprogram.intModel();
					}
				}
Functionalprogram.array2D(r,c,arr);
	}

}
