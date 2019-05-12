package com.completed;

public class Front3 {

	public static void main(String[] args) {
		String str="kitten";
		String temp;
		if(str.length()<3) {
			System.out.println(str);
		}
		else {
			temp = str.substring(0, 3);
			System.out.println(temp+temp+temp);
		}
	
		

	}

}
