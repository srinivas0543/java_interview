package java_interview;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class VowelsCountMaxRepeated {

	public static void main(String[] args) {
		
		String input = "Srinivasarao".toLowerCase();

		Map.Entry<Character, Long> counts = input.chars() 
		    .mapToObj(c -> (char) c) 
		    // Filter characters to include only vowels and consonants
		    .filter(c -> "aeiou".indexOf(c) != -1) 
		    // Collect the filtered characters into a map
		    .collect(Collectors.groupingBy( 
		        c -> (char)c, 
		        Collectors.counting() 
		    ))
		    .entrySet().stream()
		    .max(Map.Entry.comparingByValue()).get();
		
		
		System.out.println("Counts: " +counts); 
	}

}
