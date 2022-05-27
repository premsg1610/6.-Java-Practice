package com.Day6_Q2;

public class Main {

	public static void main(String[] args) {
		
		int N = 3;
		int M = 3;
		
		int[][] arr = new int[N][M];
		
//		int[][] arr = {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9}
//		};
		
		int count = 1;
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<M; j++)
			{
				arr[i][j] =  count;
				count++;
			}
		}
		
		for(int i=0; i<M; i++)
		{
			int sum = 0;
			for(int j=0; j<N; j++)
			{
				if(arr[j][i] % 2 == 0)
				{
					sum += arr[j][i];
				}
			}
			System.out.println(sum);
		}
	}
}
