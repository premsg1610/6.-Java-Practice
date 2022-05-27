package com.Day6_Q1;

import java.util.Scanner;

public class Main {

	public static String reversString(String input){
		
//		char[] charArr = input.toCharArray();
		
		int size = input.length();
		char[] arr = new char[size];
		
		for(int i=0; i<size; i++)
		{
			arr[i] = input.charAt(i);
		}
		
		String revString = "";
		for(int i=size-1; i>=0; i--)
		{
			revString += arr[i];
		}
		
		return revString;
		
		}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String originalString = sc.next();
		
		
		String result = reversString(originalString);
		
		System.out.println("Original String is :"+ originalString);
		System.out.println("Reversed String is :"+ result);
		}
}

