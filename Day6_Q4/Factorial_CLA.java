package com.Day6_Q4;

public class Factorial_CLA {

	public static void main(String[] args) {
		
		if(args.length == 1)
		{
			int num1 = Integer.parseInt(args[0]);
			
			int fact = 1;
			for(int i=2; i<=num1; i++)
			{
				fact *= i;
			}
			System.out.println(fact);
		}
		else if(args.length == 2)
		{
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			
			int diff;
			if(num1 > num2)
			{
				diff = num1 - num2;
			}
			else {
				diff = num2 - num1;
			}
			int fact = 1;
			for(int i=2; i<=diff; i++)
			{
				fact *= i;
			}
			System.out.println(fact);
		}
		else if(args.length >= 3)
		{
			System.out.println("Error");
		}
	}
}
