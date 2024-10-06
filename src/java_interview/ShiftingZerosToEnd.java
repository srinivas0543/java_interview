package java_interview;

import java.util.Arrays;

public class ShiftingZerosToEnd {

	public static void main(String[] args) {
		 int[] numbers = { 1, 2, 0, 4, 5, 0, 4, 0, 1, 3, 4 };
			
		    int i;
		    int temp;
		    int count = 0;
		    for (i = 0; i < numbers.length; i++) {
		        if ((numbers[i] != 0)) {
		            temp = numbers[count];
		            numbers[count] = numbers[i];
		            numbers[i] = temp;
		            count = count + 1;
		        }
		    }
		    System.out.println(Arrays.toString(numbers));
		}
		
	

}
