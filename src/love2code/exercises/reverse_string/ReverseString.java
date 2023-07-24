package love2code.exercises.reverse_string;

public class ReverseString {
    public static void main(String[] args) {
        String word = "Java".toLowerCase();
        reverse(word);
    }

    public static void reverse(String str) {
        System.out.println("Original word: " + str);
        char[] charString = str.toCharArray();
        char reverseString = '\u0000';

        int length = str.length();
        System.out.print("Reversed word: " );
        for (int i = length - 1; i >= 0; i--) {
            reverseString = charString[i];
            System.out.print(reverseString);
        }
    }

}
