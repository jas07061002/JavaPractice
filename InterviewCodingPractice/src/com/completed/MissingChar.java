package com.completed;

import java.util.Arrays;

public class MissingChar  {

	public static void main(String[] args) {
		String str="kitten";
		int n= 4;
		
		String tempArr[] = str.split("");
		tempArr[n] = "";
		System.out.print(Arrays.toString(tempArr).replace(",", "").replace(" ", "").replace("[", "").replace("]", ""));
		
	}

}
