package com.completed;

import java.util.Arrays;

public class CircularSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {8, 9, 10, 2, 5, 6};
		int [] arr1 = new int[arr.length];
		int firstNum = arr[0];
		int count =0;
		int temp =0;
		for(int i=0;i<arr.length;i++) {
			if(firstNum > arr[i]) {
				temp = firstNum;
				System.out.println(">>>>>>>>>>Temp is " +temp);
				firstNum= arr[i];
				System.out.println(">>>>>>>>>>Firstnum is " +firstNum);
				arr[i]=temp;
				System.out.println(">>>>>>>>>>arr[i] is " +arr[i]);
				
				count++;
			}
			else {
				
			}
			System.out.println(Arrays.toString(arr));
			System.out.println("Temp is " +temp);
			System.out.println("Count is " +count);
		}

	}

}
