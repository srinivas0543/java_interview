package java_interview;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LongestSubString {

	public static void main(String[] args) {
		
		//String str = "abcabcwaberabcd";
		String str = "ababaac";
		
		String string = IntStream.range(0, str.length()) // generating starting indices
		        .boxed()
		        .flatMap(start -> IntStream.rangeClosed(start + 1, str.length()).mapToObj(end -> str.substring(start,  end))) // generating ending indices and turning each combination of `start` and `end` into a substring
		        .collect(Collectors.toMap(   // creating an intermediate map Map<String, Boolean>
		            Function.identity(),
		            s -> false,              // is repeated substring = false, because element has been encountered for the first time
		            (v1, v2) -> true         // substring has been encountered more than once, i.e. is proved to be repeated
		        ))
		        .entrySet().stream()
		        .filter(Map.Entry::getValue) // filtering the repeated substrings
		        .max(Map.Entry.comparingByKey(Comparator.comparingInt(String::length))) // returns Optional<Map.Entry<String, Boolean>>
		        .map(Map.Entry::getKey)      // returns Optional<String>
		        .orElse("");  
		
		System.out.println("string"+string);

	}

}
