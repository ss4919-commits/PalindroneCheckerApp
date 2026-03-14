/**
 * MAIN CLASS UseCase11PalindromeCheckerApp
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * This class demonstrates object-oriented design
 * by separating palindrome logic into a service class.
 *
 * The PalindromeService class exposes a method
 * checkPalindrome() to validate whether a string
 * is a palindrome.
 *
 * @author Developer
 * @version 11.0
 */

public class UseCase11PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "madam";

        // Create service object
        PalindromeService service = new PalindromeService();

        // Call palindrome check
        boolean result = service.checkPalindrome(input);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + result);
    }
}


/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the given string is palindrome.
     *
     * @param input Input string
     * @return true if palindrome otherwise false
     */
    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        // Compare characters from both ends
        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}