package java_interview;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numList = Stream.of(12,34,55,32,45).toList();
		//numList.stream().findFirst().ifPresent(System.out::println);
		
		//System.out.println(numList.stream().count());
		//numList.stream().filter(num-> num%2==0).forEach(System.out::println);
		
		//numList.stream().filter(num-> num%2!=0).forEach(System.out::println);
		
		//numList.stream().filter(num-> num.toString().startsWith("5")).forEach(System.out::println);
		
		//Set temp = new HashSet();
		
		//numList.stream().filter(num -> !temp.add(num)).forEach(System.out::println);
		
		/*Optional max =  numList.stream().max(Integer::compareTo);
		Optional min = numList.stream().min(Integer::compareTo);
		
		System.out.println(max.orElse(null));
		System.out.println(min.orElse(null));
		
		Object[] array = numList.toArray();
		
		if(Arrays.stream(array).distinct().count()!=array.length) {
			System.out.println("It contains duplicate values");
		}else {
		    System.out.println("It contains unique values");
		}
		
		
		List<String> words = Arrays.asList("Dev","Byte","School","Dev","Byte");
		
		Map<String,Long> wordsMap = words.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
		wordsMap.entrySet().stream().filter(m->m.getValue()>1).
		forEach(m->System.out.println("Word::"+m.getKey()+" value::"+m.getValue()));
		
		String val= "DevByteSchool";

		Map charCount = val.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

		System.out.println(charCount);*/
		
		/*
		 * String str = "aabbcddef";
		 * 
		 * Optional<Character> firstNonRepeatedChar = str.chars() .mapToObj(c -> (char)
		 * c) .collect( LinkedHashMap::new, (map, ch) -> map.put(ch,
		 * !map.containsKey(ch)), LinkedHashMap::putAll ) .entrySet() .stream()
		 * .filter(entry -> entry.getValue()) .map(Map.Entry::getKey) .findFirst();
		 * 
		 * firstNonRepeatedChar.ifPresent(System.out::println);
		 */
		String val= "DevByteSchool is";
		
		//System.out.println(Arrays.stream(val.split(" ")).map(word-> new StringBuffer(word).reverse()).collect(Collectors.joining(" ")));
		
		String str1 ="listen";
		String str2 = "silent";
				
		//String s1 = Stream.of(str1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining(""));
		//String s2 = Stream.of(str2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining(""));
		
		//if(s1.equals(s2)) {
		//	System.out.println("Anagarm");
		//}
		
		LocalDate bDate = LocalDate.of(1979, 7, 26);
		LocalDate now = LocalDate.now();
		System.out.println(ChronoUnit.YEARS.between(bDate, now));
		
		int[] arr = new int[]{23,45,67,78};
		
		int[] barr = IntStream.rangeClosed(1, arr.length).map(a->arr[arr.length-1]).toArray();
		
		IntStream.of(barr).forEach(System.out::println);
		
		System.out.println(barr.toString());
		
		String input ="abcabcde";
		Map<Character,Integer> visited = new HashMap<>();
		String output = "";
		for(int start=0,end=0;end<input.length();end++) {
			Character currchar = input.charAt(end);
			if(visited.containsKey(currchar)) {
				start = Math.max(visited.get(currchar)+1, start);
			}
			if(output.length()<end-start+1) {
				output = input.substring(start,end+1);
			}
			visited.put(currchar, end);
		}
	}

}
  
