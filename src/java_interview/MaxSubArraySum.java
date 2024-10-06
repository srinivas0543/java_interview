package java_interview;

public class MaxSubArraySum {

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 }; // Example array of numbers
		int maxSum = maxSubarraySum(nums);
		System.out.println("Maximum subarray sum: " + maxSum);
	}

	public static int maxSubarraySum(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0; // If the array is empty or null, return 0
		}
		int maxEndingHere = nums[0]; // Initialize maxEndingHere with the first element
		int maxSoFar = nums[0]; // Initialize maxSoFar with the first element
		for (int i = 1; i < nums.length; i++) {
			maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]); // Calculate maximum ending at current index
			maxSoFar = Math.max(maxSoFar, maxEndingHere); // Update maximum subarray sum seen so far
		}
		return maxSoFar; // Return maximum subarray sum
	}

}
