package java_interview;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.StreamSupport;

public class SubStringPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// SubSequence using Strings
		String s = "axc", t = "ahbgdc";
		SubStringPrograms sol = new SubStringPrograms();
		boolean vals = sol.isSubsequence(s, t);
		if(vals) {
			System.out.println("String have sub sequence");
		}else {
			System.out.println("String Do not have sub sequence");
		}

		// SubSequence using Integers
		List<Integer> sequence = Arrays.asList(1, 3, 6);
		List<Integer> global = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		boolean valInt = false;//sol.isSubsequence1(sequence, global);
		
		if(valInt) {
			System.out.println("Integer have sub sequence");
		}else {
			System.out.println("Integer Do not have sub sequence");
		}

	}

	public boolean isSubsequence(String s, String t) {
		if (s.length() == 0)
			return true;
		if (t.length() == 0)
			return false;
		int letter = 0;
		for (int i = 0; i < t.length(); i++) {
			if (s.charAt(letter) == t.charAt(i)) {
				letter++;
				if (letter >= s.length())
					return true;
			}
		}
		return false;
	}

	public boolean isSubsequence1(List<Integer> sequence, List<Integer> global) {

		Iterator<Integer> iter = global.iterator();

		boolean subSequence = sequence.stream().allMatch(itemSequence -> {
			return StreamSupport.stream(Spliterators.spliteratorUnknownSize(iter, Spliterator.ORDERED), false)
					.anyMatch(itemGlobal -> itemSequence.equals(itemGlobal));
		});

		return subSequence;
	}
}
