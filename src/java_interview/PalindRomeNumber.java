package java_interview;

import java.util.stream.IntStream;

public class PalindRomeNumber {

	public static void main(String[] args) {
		Integer number =531;
		
		//procedure for integer palindrome 1
		
		boolean palindnumber = Integer.toString(number)
                .equals(new StringBuilder(Integer.toString(number))
                        .reverse().toString());
		
		//procedure for integer palindrome 2
		String temp = number.toString();
		boolean palindnumber1 = IntStream.range(0, temp.length()/2)
				                .noneMatch(i->temp.charAt(i)!=temp.charAt(temp.length()-i-1));
		if(palindnumber1) {
		  System.out.println("palindrome Number:::");	
		}else {
			System.out.println("not palindrome Number:::");	
		}
		
		String str = "radar 1radar";
		String tempStr = str;
		
		boolean strPalind = IntStream.range(0, tempStr.length() / 2)
		   .noneMatch(i -> tempStr.charAt(i) != tempStr.charAt(tempStr.length() - i - 1));
				
		//if(str.equalsIgnoreCase(new StringBuilder(tempStr).reverse().toString())) {
		if(strPalind) {
			  System.out.println("palindrome String:::");	
			}else {
				System.out.println("not palindrome String:::");	
			}
	}

}
