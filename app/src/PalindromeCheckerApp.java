/**
 * =========================================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * =========================================================================
 * Use Case 4: Character Array Based Validation
 * * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 * * At this stage, the application:
 * - Converts string to char array
 * - Uses start and end pointers
 * - Compares characters efficiently
 * - Displays the result
 * * This reduces extra memory usage.
 * @author Developer
 * @version 4.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC4.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Step 1: Initialize the input string
        String input = "radar";

        // Step 2: Convert the string into a character array
        char[] chars = input.toCharArray();

        // Step 3: Initialize pointers
        int start = 0;              // Pointer at the beginning
        int end = chars.length - 1; // Pointer at the end

        // Assume it is a palindrome until proven otherwise
        boolean isPalindrome = true;

        // Step 4: Two-Pointer comparison loop
        // Continue comparison until pointers meet or cross
        while (start < end) {
            // Compare characters at the current pointers
            if (chars[start] != chars[end]) {
                isPalindrome = false; // Mismatch found
                break;               // Exit loop early for efficiency
            }

            // Move pointers closer to the center
            start++;
            end--;
        }

        // Step 5: Display the result
        System.out.println("Input String: " + input);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}