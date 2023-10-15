/**
 * Name- Arshjot Singh (100922122)
 * Date- 14 October 2023
 * Filename- ICE2.java
 * Description- A java program that that defines various functions and then executes them in the main function
 */
    public class ICE2 {
        /**
         * Print a line of stars.
         * @param total_number_of_stars the total number of stars to be printed.
         */
        // Defines the drawStars function that prints out the number of stars specified
        public static void drawStars(int total_number_of_stars) {
            //Start a for loop
            for (int i = 0; i < total_number_of_stars; i++) {
                // Print *
                System.out.print("*");
            }
            System.out.println();
        }

        /**
         * prints a sentence
         * @param sentence the string that is supposed to be printed.
         */
        // Defines a function that prints out the specified function
        public static void printStatement(String sentence) {
            System.out.println(sentence);
        }

        /**
         * multiply two integers.
         * @param num1 The first integer.
         * @param num2 The second integer.
         * @return The product of num1 and num2.
         */
       // Defines a function that takes 2 non-decimal numbers as input and returns the product of them
        public static int multiplyNumbers(int num1, int num2) {
            return num1 * num2;
        }

        /**
         * multiply two decimal numbers.
         * @param num1 The first decimal number.
         * @param num2 The second decimal number.
         * @return The product of num1 and num2.
         */
       // Defines a function that takes 2 numbers as input and returns the product of them
        public static double multiplyNumbers(double num1, double num2) {
            return num1 * num2;
        }

        /**
         * checks if a string is a palindrome
         * @param string The input string to check.
         * @return boolean value (True or False) of the result
         */
        // Define a function that checks whether the given string is a palindrome or not
        public static boolean isPalindrome(String string) {
            // Remove spaces and convert to lowercase for case insensitivity
            string = string.toLowerCase();
            // Check if the length of the string is less than 1 or not
            if (string.length() <= 1) {
                return true;
            }
            // Check if the indexes specified have the same character
            if (string.charAt(0) == string.charAt(string.length() - 1)) {
                // Recurse with the characters in the middle
                return isPalindrome(string.substring(1, string.length() - 1));
            }
            return false;
        }
        // Define the main function
        public static void main(String[] args) {
            // Call drawStars to generate 15 stars.
            drawStars(15);

            // Call printStatement to generate the following message: “ICE2: Function Practice Start”
            printStatement("ICE2: Function Practice Start");

            // Call multiplyNumbers with non-decimal numbers and print the result.
            int resultInt = multiplyNumbers(13, 6);
            System.out.println("Product of 13 and 6 is: "+resultInt);

            // Call multiplyNumbers with decimal numbers and print the result.
            double resultDouble = multiplyNumbers(6.2, 11.12);
            System.out.println("Product of 6.2 and 11.12 is: "+resultDouble);

            // Call printStatement to generate the following message: “ICE2: Function Practice End”
            printStatement("ICE2: Function Practice End");

            // Call drawStars to generate 15 stars.
            drawStars(15);

            // Call isPalindrome("civic") and isPalindrome("COSC1200")
            System.out.println("Is civic a palindrome? " + isPalindrome("civic"));
            System.out.println("Is COSC1200 a palindrome? " + isPalindrome("COSC1200"));
        }
    }


