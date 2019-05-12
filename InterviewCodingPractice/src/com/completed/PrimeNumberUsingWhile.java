package com.completed;
import java.util.Scanner;

public class PrimeNumberUsingWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int n = input/2;
		int flag =0;
		int i=2;
		while(i<=input/2) {
			if(input%i==0) {
				flag = 1;
				break;
			}
			i++;
			
		}
		
		if(flag==0) {
			System.out.println(input+ " is prime");
		}
		else {
			System.out.println(input+ " is not prime");
		}

	}

}
