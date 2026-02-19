import java.util.Stack;

/**
 * UC5: Stack-Based Palindrome Checker
 * Description: This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 * * @author Developer
 * @version 5.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC5.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // 1. Declare and initialize the input string
        String input = "noon";
        System.out.println("Input: " + input);

        // 2. Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // 3. Push each character of the string into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // 4. Assume palindrome initially
        boolean isPalindrome = true;

        // 5. Iterate again through original string and compare with popped values
        for (char c : input.toCharArray()) {
            // Pop returns the most recently added character (LIFO)
            char reversedChar = stack.pop();

            if (c != reversedChar) {
                isPalindrome = false;
                break;
            }
        }

        // 6. Print result
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}