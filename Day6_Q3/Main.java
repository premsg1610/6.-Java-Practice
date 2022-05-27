package com.Day6_Q3;

public class Main {

	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		//write the logic to iterate through the supplied inputArray and
		//determine each element whether it is prime or not
		//create a second array of int
		
		
		
		int[] primeArr = new int[inputArray.length];
		
		for(int i=0; i<inputArray.length; i++)
		{
			int count = 0;
			for(int j=2; j<inputArray[i]/2; j++)
			{
				if(inputArray[i] % j == 0)
				{
					count++;
				}
			}
			if(count == 0)
			{
				primeArr[i] = inputArray[i];
			}
		}
		
		//if any number is prime inside the inputArray then add that number inside the second
		//array
		//and return the second array
		//if no prime number is found then return the empty array.
		return primeArr;
		}
	
	public static void main(String[] args){
		//Create the object of Main class
		//on the object of Main class call the findAndReturnPrimeNumbers method
		//by supplying the following array as the parameter
		
		int[] arr = {10,12,5,50,11,14,15};
		
		Main m1 = new Main();
		int[] primeArr = m1.findAndReturnPrimeNumbers(arr);
		
		if(primeArr.length == 0)
		{
			System.out.println("Prime number not found in the supplied Array");
		}
		else {
			for(int i=0; i<primeArr.length; i++)
			{
				if(primeArr[i] != 0)
				{   
					System.out.println(primeArr[i]);
				}
			}
		}
		
		//print each element from the returned array of findAndReturnPrimeNumbers method
		//if findAndReturnPrimeNumbers method returns an empty array then print the following message:
		// "Prime number not found in the supplied Array"
		}
}
