package Recursion;

import java.util.Scanner;

public class PalindromeString {
    static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }


        return (str.charAt(start) == str.charAt(end) && isPalindrome(str, start + 1, end - 1));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter a string: ");
        String str = sc.nextLine();
        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.printf("string is palindrome ");
        } else {
            System.out.printf("string is not palindrome ");
        }
    }
}
