package Recursion;

import java.util.Scanner;

public class PrintOneToN {
    public static void print(int n) {
        if (n == 0) {
            return;
        }
        print(n - 1);
        System.out.println(n);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("value for N: ");
        int n = sc.nextInt();
        print(n);
        ;
    }
}
