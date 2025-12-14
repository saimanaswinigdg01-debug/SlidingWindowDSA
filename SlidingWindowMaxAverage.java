/**
 * SlidingWindowBaseline.java
 * 
 * Demonstrates the basic sliding window technique:
 * Calculates the sum of each subarray of size k in a given array.
 */

public class SlidingWindowBaseline {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        int current = 0; // sum of current window
        int n = nums.length;

        // Compute sum of first window
        for (int i = 0; i < k; i++) {
            current += nums[i];
        }
        System.out.println("Window 0 sum: " + current);

        // Slide the window across the array
        for (int i = k; i < n; i++) {
            // Remove the outgoing element, add the incoming element
            current = current - nums[i - k] + nums[i];
            System.out.println("Window " + (i - k + 1) + " sum: " + current);
        }
    }
}



/**
 * SlidingWindowMaxAverage.java
 * 
 * Finds the maximum average subarray of size k using sliding window technique:
 * - Tracks the sum of each window
 * - Keeps the maximum sum
 * - Returns the maximum average
 */

public class SlidingWindowMaxAverage {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        int current = 0; // sum of current window
        int n = nums.length;

        // Compute sum of first window
        for (int i = 0; i < k; i++) {
            current += nums[i];
        }

        int max = current; // track maximum sum seen so far

        // Slide the window across the array
        for (int i = k; i < n; i++) {
            // Remove the outgoing element, add the incoming element
            current = current - nums[i - k] + nums[i];
            // Update maximum sum if current is greater
            max = Math.max(max, current);
        }

        // Compute maximum average
        double maxAverage = (double) max / k;
        System.out.println("Maximum average: " + maxAverage);
    }
}
