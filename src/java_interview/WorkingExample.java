package java_interview;

import java.util.*;
public class WorkingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "ababcda";
		
		Map<Character,Integer> visited = new HashMap<>();
		String output = "";
		for(int start=0,end=0;end<input.length();end++) {
			char currenChar = input.charAt(end);
			if(visited.containsKey(currenChar)) {
				start = Math.max(visited.get(currenChar)+1, start);
			}
			
			if(output.length()<end - start + 1) {
				output = input.substring(start, end+1);
			}
			
			visited.put(currenChar, end);
		}
		
      System.out.println(output);
	}

}
