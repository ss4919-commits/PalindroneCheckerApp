import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * MAIN CLASS UseCase6PalindromeCheckerApp
 * Use Case 6: Queue + Stack Palindrome Check
 * * Description:
 * This class demonstrates palindrome validation using two different data structures:
 * 1. Queue (FIFO - First In First Out)
 * 2. Stack (LIFO - Last In First Out)
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC6.
     * @param args Command-Line arguments
     */
    public static void main(String[] args) {
        // Define the input string to validate
        String input = "civic";

        // Create a Queue to store characters in FIFO order (using LinkedList implementation)
        Queue<Character> queue = new LinkedList<>();

        // Create a Stack to store characters in LIFO order
        Stack<Character> stack = new Stack<>();

        // Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);  // Enqueue
            stack.push(c); // Push
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare characters until the queue becomes empty
        while (!queue.isEmpty()) {
            // dequeue() vs pop()
            char fromQueue = queue.remove();
            char fromStack = stack.pop();

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Output results
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}