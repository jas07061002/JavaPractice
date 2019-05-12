package com.completed;

public class FrontBackStringExchanged {

	public static void main(String[] args) {
		String str="a";
		if(str.length()>1) {
		String front = str.substring(0,1);
		String back = str.substring(str.length()-1,str.length());
		String mid = str.substring(1,str.length()-1);
		
		String result = back + mid+ front;
		System.out.println(result);
		}
		else {
			System.out.println(str);
		}

	}

}
