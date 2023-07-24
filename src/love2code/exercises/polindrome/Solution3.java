package love2code.exercises.polindrome;

import java.util.Scanner;

public class Solution3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        StringBuilder sb = new StringBuilder(A);
        String B = sb.reverse().toString();

        if(A.equals(B)){
            System.out.println("Yes");

        } else {
            System.out.println("No");
        }

    }
}

