package java_interview;

public class ContainerWithMostWater {

	public static int maxArea(int[] a) {

		int Area = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				Area = Math.max(Area, Math.min(a[i], a[j]) * (j - i));
			}
		}
		return Area;
	}
//1,2,3  - 3
	
	
// Driver code 
	public static void main(String[] args) {
		int a[] = { 1, 5, 4, 3 };
		int b[] = { 3, 1, 2, 4, 5 };
		int c[] = {1,8,6,2,5,4,8,3,7};

		System.out.println(maxArea(a));
		System.out.println(maxArea(b));
		System.out.println(maxArea(c));
	}
}

// This code is contributed by mulchandanimanisha5
