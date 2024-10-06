package java_interview;

import java.util.*;

public class LargestSubSstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcabcbb";
		Map<Integer,Set> subMap = new HashMap<>();
		subMap	= longestSubStr(s);
		System.out.println(subMap);
	}
	
	public static Map<Integer,Set> longestSubStr(String s){
		
		Map<Integer,Set> subMap = new HashMap<>();
		int ans =0;HashSet<Character> set = null;
		
		for(int i=0;i<s.length();i++) {
			set = new HashSet();
			set.add(s.charAt(i));
			for(int j=i+1;j<s.length();j++) {
				
				if(set.contains(s.charAt(j))) {
					break;
					
				}else {
					ans = Math.max(ans, set.size());
				}
			}
			
		}
		subMap.put(ans, set);
		
		
		return subMap;
		
	}
	

}
