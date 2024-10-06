package java_interview;

import java.util.stream.*;
import java.util.*;

public class PrimeNumbers {

	public static void main(String[] args) {
	    List<Integer> list = IntStream.range(0, 100).filter(i -> isPrime(i)).boxed().collect(Collectors.toList());
	    System.out.println(list);

	}

	static boolean isPrime(int number) {
	    return number > 1 && IntStream.rangeClosed(2, number/2).noneMatch(i -> number % i == 0);
	}
}
