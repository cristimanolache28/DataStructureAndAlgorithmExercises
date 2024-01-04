package love2code.exercises.hackerrank.regular_expresion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        String userNamePattern = "^[A-Za-z][A-za-z0-9_]{7,29}$";
        List<String> usernames = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int totalUserName = sc.nextInt();

        Pattern userPattern = Pattern.compile(userNamePattern);

        while (sc.hasNext()) {

            String userName = sc.next();
            usernames.add(userName);
            if (totalUserName <= usernames.size()) {
                break;
            }
            Matcher validUserName = userPattern.matcher(userName);
            if (validUserName.matches()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
