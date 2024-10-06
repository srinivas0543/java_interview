package java_interview;

public class LeaderOfIntegers {

	public static void main(String[] args) {
		
		int[] arr = {92,23,45,6,7,9,5};
		
		 int leader = arr[arr.length-1];
		 
		 System.out.println(leader);
		 
		 for(int i= arr.length-2;i>=0;i--) {
			 
			 if(arr[i]>leader) {
				 leader = arr[i];
				 System.out.println(leader);
				 
			 }
		 }
		
	}

}
