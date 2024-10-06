package java_interview;

import java.util.*;

public class Example {

	public static void main(String[] args) {
		
		System.out.println("Non- repeated substring..");
		
		String sub = getUniqueCharacterSubstring("ababcda");
		
		System.out.println("Non- repeated substring:"+sub);
		
		System.out.println("I am learning learning java java questions");
		String s = "I am learning learning java java questions";
		Map<String,Integer> strMap = new HashMap<String, Integer>();
		int count =1;
		String[] arr = s.split(" ");
		for(int i=0; i<arr.length;i++) {
			
			if(!strMap.containsKey(arr[i])) {
				strMap.put(arr[i], count);
			}else {
				strMap.put(arr[i], strMap.get(arr[i])+1);
			}
		}
		
		for(String x:strMap.keySet()) {
			System.out.println("The count of the word::"+x+ "::"+strMap.get(x));
		}

	}
	
	public static String getUniqueCharacterSubstring(String input) {
	    Map<Character, Integer> visited = new HashMap<>();
	    String output = "";
	    for (int start = 0, end = 0; end < input.length(); end++) {
	        char currChar = input.charAt(end);
	        if (visited.containsKey(currChar)) {
	            start = Math.max(visited.get(currChar)+1, start);
	        }
	        if (output.length() < end - start + 1) {
	            output = input.substring(start, end + 1);
	        }
	        visited.put(currChar, end);
	        
	    }
	    return output;
	}

}
