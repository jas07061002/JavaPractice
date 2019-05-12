package com.completed;

import java.util.Arrays;

public class ArrayRotationReversed {

	public static void main(String[] args) {
		int num = 7;
		int d = 2;
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		
	
		for(int i=0;i<d;i++) 
		{
		for (int j =arr.length-1; j >0 ; j--) {
			int temp = arr[j];
			arr[j]= arr[j-1];
			arr[j-1]= temp;
//		System.out.print(arr[j]);
//		System.out.println();
		}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
