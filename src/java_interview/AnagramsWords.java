package java_interview;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramsWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Stream.of("pool", "loop", "stream", "arc", "odor", "car",
		        "rood", "meats", "fires", "fries", "night", "thing", "mates", "teams").collect(Collectors.toList());
		
	         
		
		Map<int[], List<String>> anagrams = words.stream()
		        .collect(Collectors.toMap(
		                // key - a sorted array of character code points
		                word -> word.codePoints().sorted().toArray(),
		                // value - a list of anagrams
		                word -> new ArrayList<>(List.of(word)),
		                // merge elements of two lists
		                (list1, list2) -> {
		                    list1.addAll(list2);
		                    return list1;
		                },
		                // comparator that compares two int[] arrays
		                () -> new TreeMap<>(Arrays::compare)));
		
		anagrams.forEach((k, v) -> System.out.println(v.get(0) + "=" + v));

	
	
	
	}
	
}
