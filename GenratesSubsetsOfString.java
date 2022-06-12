package Recursion;

import java.util.Scanner;

public class GenratesSubsetsOfString {
    static void subsets(String str, String curr, int i) {
        if (i == str.length()) {
            System.out.print(curr + " ");
            return;
        }

        subsets(str, curr, i + 1); //not adding
        subsets(str, curr + str.charAt(i), i + 1); //adding
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter the string :");

        String str = sc.next();
        subsets(str, "", 0);
    }
}
