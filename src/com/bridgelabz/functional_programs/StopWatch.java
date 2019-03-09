package com.bridgelabz.functional_programs;
import java.util.concurrent.TimeUnit;

import com.bridgelabz.util.Functionalprogram;

public class StopWatch {

	public static void main(String[] args) throws InterruptedException {
	long s=System.currentTimeMillis();
	System.out.println("Starting time of a clock="+s);
	TimeUnit.SECONDS.sleep(5);
	long l=System.currentTimeMillis();
	System.out.println("Ending time of a clock="+l);
	Functionalprogram.watch(s,l);
	
	

	}

}
