package com.completed;
import java.util.ArrayList;
import java.util.Arrays;

public class BruteForce {

	public static void main(String[] args) {
		int[] arr = new int[4];
		arr[0]=2;
		arr[1]=7;
		arr[2]=11;
		arr[3]=15;
		int sum=0;
		int [] arr1 = null;
		
		 for (int i = 0; i < arr.length; i++) {
		        for (int j = i + 1; j < arr.length; j++) {
		            if (arr[j] == 9 - arr[i]) {
		                arr1= new int[] { i, j };
		                System.out.println(Arrays.toString(arr1));
		            }
		        }
		    }
		
	}

}
