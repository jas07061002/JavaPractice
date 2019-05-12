package com.completed;
import java.util.HashMap;
import java.util.Map;

public class AddNumbersComplex {


	public static void main(String[] args) {
		int[] nums = new int[4];
		nums[0]=2;
		nums[1]=7;
		nums[2]=11;
		nums[3]=15;
		int sum=0;
		int target =9;
		int [] arr1 = null;
		
		 Map<Integer, Integer> map = new HashMap<>();
		    for (int i = 0; i < nums.length; i++) {
		        map.put(nums[i], i);
		    }
		    System.out.println(map);
		    for (int i = 0; i < nums.length; i++) {
		        int complement = target - nums[i];
		        System.out.println(">>>>>>>>>>>>>>>>>>>Map.getComplement value: " +map.get(complement));
		        if (map.containsKey(complement) && map.get(complement) != i) {
		        	arr1= new int[] { i, map.get(complement) };
		        }
		    }
		
	}

}
