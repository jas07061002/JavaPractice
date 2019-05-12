package com.completed;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class StringE {

	public static void main(String[] args) {
		String str ="";
		String strNew ="mix snacks";
		String str2 ="pi9 snacks";
		String st = "a";
		HashMap <String, Integer> map = new HashMap<>();
		
		int count = 0;
		
		String [] tempArr = str.replace(" ", "").split("");
		
	//	System.out.println(Arrays.toString(tempArr));
		for(int i=0;i<tempArr.length;i++) {
			if(map.containsKey(tempArr[i])) {
				map.put(tempArr[i], (map.get(tempArr[i]))+1);
			}
			else {
				map.put(tempArr[i], 1);
			}
		}
		
		for (Entry<String, Integer> entry : map.entrySet()) {
	//		System.out.println(">>>>>>>>>>>>>>>>>>>");
		    String key = entry.getKey();
		    Integer value = entry.getValue();
		 //   System.out.println("Key is : " +key);
		//    System.out.println("Value is : " +value);
		    if(key.equals("e")) {
		  // 	System.out.println(">>>>>>Inside this if");
		    	if(value >=1 && value<=3)
		    	System.out.println(true);
		    	else 
		    		System.out.println(false);
		    	
		    }
		    else {
		    	System.out.println(false);
		    }
		}


	

	}

}



