package love2code.exercises.polindrome;

import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A, revA="";
        A=sc.next();

        int n = A.length();

        for(int i=n-1;i>=0;i--)
        {
            revA=revA + A.charAt(i);
        }
        if(A.equals(revA))
            System.out.print("Yes");
        else
            System.out.print("No");
    }

}
