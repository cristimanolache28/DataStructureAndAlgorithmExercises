package love2code.exercises.polindrome;

import java.util.Scanner;

public class Solution1 {

    public static void isPalindrome(String word, String reverseString) {
        if (word.equals(reverseString)) {
            System.out.println("Yes");
        } else
            System.out.println("No");
    }

    public static String reverseString(String word) {
        String tempResult = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            String reverseWorld = String.valueOf(word.charAt(i));
            tempResult = tempResult + reverseWorld;
        }
        return  tempResult;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        String reversedString = reverseString(word);

        isPalindrome(word, reversedString);

    }
}
