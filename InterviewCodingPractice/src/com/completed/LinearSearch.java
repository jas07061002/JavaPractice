package com.completed;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 80, 30, 60, 50, 110, 100, 130, 170 };
		int num = 110;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == num) {
				System.out.println(num+" is found at position "+ i);
			}
			else {
				System.out.println("Number not found");
			}
		}

	}

}
