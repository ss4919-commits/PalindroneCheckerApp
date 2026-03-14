/**
 * MAIN CLASS UseCase13PalindromeCheckerApp
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures the execution time
 * of a palindrome validation algorithm.
 *
 * It captures the start time and end time
 * using System.nanoTime() and calculates
 * the total execution duration.
 *
 * @author Developer
 * @version 13.0
 */

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Level";

        // Record start time
        long startTime = System.nanoTime();

        // Palindrome check logic
        String normalized = input.toLowerCase();
        boolean isPalindrome = true;

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Record end time
        long endTime = System.nanoTime();

        // Calculate execution time
        long executionTime = endTime - startTime;

        // Output results
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
        System.out.println("Execution Time: " + executionTime + " ns");
    }
}