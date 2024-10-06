package java_interview;

import java.util.LinkedList;

public class FizzBuzzString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;

		LinkedList<String> list = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			if (i % 15 == 0)
				list.add("FizzBuzz");
			else if (i % 3 == 0)
				list.add("Fizz");
			else if (i % 5 == 0)
				list.add("Buzz");
			else
				list.add(String.valueOf(i));
		}
		
		System.out.println(list);

	}

}
