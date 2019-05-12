package com.completed;

public class StartWithOz {

	public static void main(String[] args) {
		
		String str = "a";
		if(str.length()>1) {
		if((str.toLowerCase().charAt(0)=='o') && (str.toLowerCase().charAt(1)=='z')) {
			System.out.println("oz");
		}
		else if((str.toLowerCase().charAt(0)=='o')) {
			System.out.println("o");
		}
		else if((str.toLowerCase().charAt(1)=='z')) {
			System.out.println("z");
		}
		else {
			System.out.println(str);
		}
		}
	}

}
