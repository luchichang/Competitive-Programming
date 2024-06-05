package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome(121) );
    }


/*
*     Complexity Analysis
* TIME  COMPLEXITY : O(logn)
* SPACE COMPLEXITY : O(1)
*/
    public static String isPalindrome(int num) {
        if (num <= 9 && num >= 0) return num + " is Palindrome.";

        int noOfDigits = (int) Math.log10(num) + 1; // TC = O(logn)
        int leftDivisor = (int) Math.pow(10, noOfDigits - 1); // TC = O(logn)
        int rightDivisor = 10;

//TC for iterator is O(n/2). where n, is no of digits
        for (int i = 0; i < noOfDigits / 2; i++) {
            int leftDigit = (num / leftDivisor) % 10;
            int rightDigit = (num % rightDivisor) / (int) Math.pow(10, i);

            if (leftDigit != rightDigit) {
                return num + " is not a Palindrome.";
            }

            leftDivisor /= 10;
            rightDivisor *= 10;
        }

        return num + " is Palindrome.";
    }
}
