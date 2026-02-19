
        /**
         * =============================================================================
         * MAIN CLASS - UseCase2PalindromeCheckerApp
         * =============================================================================
         * * Use Case 2: Hardcoded Palindrome Validation
         * * Description:
         * This class demonstrates basic palindrome validation
         * using a hardcoded string value.
         * * At this stage, the application:
         * - Stores a predefined string
         * - Compares characters from both ends
         * - Determines whether the string is a palindrome
         * - Displays the result on the console
         * * This use case introduces fundamental comparison logic
         * before using advanced data structures.
         * * @author Developer
         * @version 2.0
         */
        public class PalindromeCheckerApp {

            /**
             * Application entry point for UC2.
             * * @param args Command-line arguments
             */
            public static void main(String[] args) {
                // 1. Define the input (Missing in your screenshot)
                java.util.Scanner sc = new java.util.Scanner(System.in);
                System.out.println("Enter a string:");
                String input = sc.nextLine();

                boolean isPalindrome = true;
                int length = input.length();

                // 2. The Loop (Make sure to remove the // from the start)
                for (int i = 0; i < length / 2; i++) {
                    // Compare front character with back character
                    if (input.charAt(i) != input.charAt(length - 1 - i)) {
                        isPalindrome = false;
                        break; // Now this works because it's inside a loop!
                    }
                }

                // 3. Display the result
                if (isPalindrome) {
                    System.out.println("The string \"" + input + "\" is a palindrome.");
                } else {
                    System.out.println("The string \"" + input + "\" is NOT a palindrome.");
                }
            }}