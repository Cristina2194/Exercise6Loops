package com.Exercise6Loops;

public class Exercise6Loops {

	public static void main(String[] args) {
		// Constant declarartion
		
		// Variable declaration
		
		//Objects construction
		
		//Create a series of 1-100 1 by 1
		for(int i=1; i<=100;i++);
		{
		System.out.printl(i);
		}
		//Create a series of 1-100 1 by 1
		for(int i=100; i>=100;i--);
		{
		System.out.println(i);
		}
		for(int i=0;i<=100;i+2)
		{
	    System.out.println(i);
		}
		
		System.out.printl("Display add numbers from 100 to 200");
		for(int i=100; i<200;i++);
		{
			if(i%2==0)
			{
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Display just the half of the sequence 100 to 200");
			for(int i=100;i<200;i++);
			if(i==150)
			{
				break;
			}
		}
	}
}
