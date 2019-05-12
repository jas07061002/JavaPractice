package com.completed;

public class BinarySearch {

	public static void main(String[] args) {
		int [] arr = {0,5,13,19,22,41,55,68,72,81,98};
		int mid = (arr.length)/2;
		int low = 0;
		int high = arr.length;
		int searchNum = 55;
		
		if(searchNum == arr[mid]) {
			System.out.println("The index of searchNum is+ " +mid);
		}
		else if(searchNum < arr[mid]) {
			high = mid -1;
			
		}
		
		else {
			low = mid + 1;
		}

	}

}
