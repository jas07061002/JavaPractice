package com.completed;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int n = input/2;
		int flag = 0;
		if(input == 0 || input ==1 ) {
			System.out.println("0 and 1 are not prime numbers");
		}
		for(int i=2;i<n;i++) {
			if(input%i==0) {
				System.out.println(input+ " is not a prime number");
				flag = 1;
				break;
			}
			
		}
		if(flag ==0) {
			System.out.println(input+ " is a prime number");
		}

	}

}
