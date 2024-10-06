package java_interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VowelsAndConstantsCount {

	public static void main(String[] args) {
		
		//Stream<String> strStream = null; Srinivasarao
		
		String input = "Srinivasarao".toLowerCase();

		Map<String, Long> counts = input.chars() 
		    .mapToObj(c -> (char) c) 
		    // Filter characters to include only vowels and consonants
		    .filter(c -> "aeiou".indexOf(c) != -1 || "bcdfghjklmnpqrstvwxyz".indexOf(c) != -1) 
		    // Collect the filtered characters into a map
		    .collect(Collectors.groupingBy( 
		        c -> "aeiou".indexOf(c) != -1 ? "vowels" : "consonants", 
		        Collectors.counting() 
		    ));

		System.out.println("Counts: " + counts); 
	    
	
	}

}
 