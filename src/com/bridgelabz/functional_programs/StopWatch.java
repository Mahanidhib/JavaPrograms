package com.bridgelabz.functional_programs;


import com.bridgelabz.util.Functionalprogram;

public class StopWatch {

	public static void main(String[] args) throws InterruptedException {
	long s=System.nanoTime();
	System.out.println("Starting time of a clock="+s);
	
	long l=System.nanoTime();
	System.out.println("Ending time of a clock="+l);
	long time=Functionalprogram.watch(s,l);
	
	System.out.println("Clock time in nanosecond="+time);

	}

}
