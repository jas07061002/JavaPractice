package com.completed;

import java.util.Arrays;

public class SwapFirstAndLastCharacter {


	public static void main(String[] args) {
		String str = "geeks for geeks";
		String[] temp = str.split(" ");
		String [] result = new String[temp.length];
		String last, first,tempresult;
		for(int i=0;i<temp.length;i++) {
			 last = temp[i].substring(temp[i].length()-1);
			 first = temp[i].substring(0,1);
			 tempresult =temp[i].substring(1,temp[i].length()-1) ;
			result[i] = last + tempresult + first+"";
		//	System.out.println(result[i]);
			
		}
		System.out.println(Arrays.toString(result).replace("[","").replace("]", "").
				replace(",", ""));
	}

}
