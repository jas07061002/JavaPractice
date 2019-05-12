package com.completed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class EveryNth {

	public static void main(String[] args) {
		String str="Chocolates";
		int n= 100;
		ArrayList<String> tempList = new ArrayList<>();
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		String tempArr[] = str.split("");
		for(int i=0;i<tempArr.length;i++) {
			if(map.containsKey(tempArr[i])) {
				map.put(i,tempArr[i]);
			}
			else {
				map.put(i,tempArr[i]);
			}
		}
		System.out.println(map);
	
		for (Entry<Integer,String> entry : map.entrySet()) {
			Integer key = entry.getKey();
			 String value = entry.getValue();
			if(key%n == 0) {
				tempList.add(value);
			}
			
		}
		
		System.out.println(tempList.toString().replace("[", "").replace(",", "").replace("]", "").replace(" ", ""));

	}

}
