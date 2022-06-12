package Recursion;

import java.util.Scanner;

public class ReverseString {
    static void reverse(String str, int i) {
        if (i == str.length() - 1) {
            System.out.print(str.charAt(i));
            return;
        }
        reverse(str, i + 1);
        System.out.print(str.charAt(i));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("give the String :");
        String str = sc.nextLine();
        reverse(str, 0);
    }
}
