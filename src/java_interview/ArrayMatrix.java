package java_interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ArrayMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[][] data = {{3, 2, 5},
                {1, 4, 4, 8, 13},
                {9, 1, 0, 2},
                {0, 2, 6, 3, -1, -8}};
		/*//IntSummaryStatistics stats = Arrays.stream(data).flatMapToInt(Arrays::stream).collect((Supplier<int>) Collectors.summarizingInt(Integer::intValue)).summaryStatistics();
		//int max = stats.getMax();
		//int min = stats.getMin();
		IntSummaryStatistics stats = Arrays.stream(data)
                .flatMap(Arrays::stream)
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .summaryStatistics();  

              int min = stats.getMin();
              int max = stats.getMax();
              double avg = stats.getAverage();
              System.out.println("Minimum = " + min);
              System.out.println("Maximum = " + max);*/
              
              Integer[] a  = Arrays.stream(data)
                      .flatMap(Arrays::stream)
                      .filter(Objects::nonNull)
                      .mapToInt(Integer::intValue)
                      .boxed()
                      .toArray(Integer[]::new)
                      
                      ;
             // Arrays.sort(a, Collections.reverseOrder());
            
             // Integer[] arr = Arrays.stream(a).boxed().toArray(Integer[]::new);
              Arrays.stream(a).sorted(Collections.reverseOrder()).forEach(System.out::println);
              
              int max = 3;
              
             Optional<Integer> an = Arrays.stream(a).sorted(Collections.reverseOrder()).skip(a.length-max-1).findFirst();
              System.out.println(an.orElseGet(null));
             //Arrays.sort(a,Comparator.comparingInt(C));
      
	}

}


