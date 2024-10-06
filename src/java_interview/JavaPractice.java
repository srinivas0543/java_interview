package java_interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class JavaPractice {

	public static void main(String[] args) {
		
		String s;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter a String: ");  
		s=sc.nextLine();  
		//reading string from user  
		StringBuffer sb = new StringBuffer();
		System.out.print("After reverse string is: ");  
		for(int i=s.length();i>0;--i)                //i is the length of the string  
		{  
			sb.append(s.charAt(i-1));
		System.out.print(s.charAt(i-1));            //printing the character at index i-1  
		}  
			
		System.out.println(sb);
		} 
	

}
