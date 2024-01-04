package love2code.exercises.hackerrank.java_biginteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();

        if (a.compareTo(BigInteger.ZERO) > 0
                && b.compareTo(BigInteger.ZERO) > 0) {
            System.out.println(a.add(b));
            System.out.println(a.multiply(b));
        }
    }
}
