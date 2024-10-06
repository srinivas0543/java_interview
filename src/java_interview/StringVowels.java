package java_interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringVowels {

	public static void main(String[] args) {
		
		List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");
		
		String  string ="hello";
		
		Long count = Arrays.stream(string.split(""))  // generate stream from an String[] of single character strings
	    .filter(vowels::contains)  // remove all non-vowels
	    .count() ;          
	   // .collect(Collectors.toList()) ; 
		
		System.out.println(count);

	}

}
