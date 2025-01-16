/*
Write a program to to check if a text is palindrome and display the result
Hint => 
Palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward
Logic 1: Write a method to compare the characters from the start and end of the string to determine the text is palindrome. The logic used here is as follows:
Set the start and end indexes of the text
Loop through the text and compare the characters from the start and the end of the string. If the characters are not equal, return false
Logic 2: Write a recursive method to compare the characters from the start and end of the text passed as parameters using recursion. The logic used here is as follows:
First, check if the start index is greater than or equal to the end index, then return true.
If the characters at the start and end indexes are not equal, return false.
Otherwise, call the method recursively with the start index incremented by 1 and the end index
Logic 3: Write a Method to compare the characters from the start and end of the text using  character arrays. The logic used here is as follows:
Firstly Write a Method to reverse a string using charAt() method and return the reversal array.
Create a character array using String method toCharArray() and also create a reverse array. Compare the characters in the original and reverse arrays to do Palindrome check 
Finally in the main method do palindrom check using the three logic and display result
*/


import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Logic 1: Compare characters from start and end
        boolean result1 = isPalindromeLogic1(inputText);

        // Logic 2: Compare characters using recursion
        boolean result2 = isPalindromeLogic2(inputText, 0, inputText.length() - 1);

        // Logic 3: Compare characters using character arrays
        boolean result3 = isPalindromeLogic3(inputText);

        // Display the results
        System.out.println("Logic 1 - Is palindrome: " + result1);
        System.out.println("Logic 2 - Is palindrome: " + result2);
        System.out.println("Logic 3 - Is palindrome: " + result3);

        scanner.close();
    }

    // Logic 1: Compare characters from start and end
    public static boolean isPalindromeLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Compare characters using recursion
    public static boolean isPalindromeLogic2(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeLogic2(text, start + 1, end - 1);
    }

    // Logic 3: Compare characters using character arrays
    public static boolean isPalindromeLogic3(String text) {
        char[] originalArray = text.toCharArray();
        char[] reversedArray = reverseString(text);
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to reverse a string using charAt() method
    public static char[] reverseString(String text) {
        char[] reversedArray = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reversedArray[i] = text.charAt(text.length() - 1 - i);
        }
        return reversedArray;
    }
}
