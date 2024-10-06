package java_interview;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionAPI {
    public static void main(String[] args) {
        List<Integer> listPfNumber = Stream.of(21,23,34,56,67,23,71,63).collect(Collectors.toList());
        
       // Map<Long, List<Integer>> integerMap =  listPfNumber.stream().mapToInt(num->num,collect(Collector.groupingBy(num)));
        
        Map  integerMap = listPfNumber.stream().collect(Collectors.groupingBy(s->s ,Collectors.counting()));
        		
        System.out.println(integerMap);		
    }
}