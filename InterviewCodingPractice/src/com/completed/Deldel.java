package com.completed;

public class Deldel {

	public static void main(String[] args) {

		String str = "anc";
		if (str.length() > 3) {
			if (str.indexOf("del") == 1) {
				System.out.println(str.replace("del", ""));
			}
		} else {
			System.out.println(str);
		}

	}

}
