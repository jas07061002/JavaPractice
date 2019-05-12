package com.completed;
import java.util.Scanner;

public class PrimeNumberBetweenIntervals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		
		while(input1<input2) {
			boolean flag = false;
			for(int i=2;i<=input1/2;i++) {
				if(input1%i==0) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.print(input1 + " ");
			}
			input1++;
		}
	}

}