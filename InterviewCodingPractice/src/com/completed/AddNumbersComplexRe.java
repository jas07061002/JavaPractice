package com.completed;
import java.util.Arrays;
import java.util.HashMap;

public class AddNumbersComplexRe {

	public static void main(String[] args) {
		
		HashMap<Integer,Integer> map= new HashMap<>();
		int [] newArr = null;
		int target =9;
		int arr[] = {2,7,11,15};
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i],i);
		}
		System.out.println(map);
		int complement =0;
		for(int i=0;i<arr.length;i++) {
			complement = target - arr[i];
			if(map.containsKey(complement) && map.get(complement)!= i)
				newArr = new int[] {map.get(complement),i};
			
		}
		System.out.println(Arrays.toString(newArr));

	}

}
