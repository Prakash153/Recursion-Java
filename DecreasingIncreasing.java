package Recursion;

import java.util.Scanner;

public class DecreasingIncreasing {
    static void dec(int n) {
        if (n == 1) {
            System.out.println(n + " ");
            return;
        }
        System.out.println(n + " ");
        dec(n - 1);
    }

    static void inc(int n) {
        if (n == 1) {
            System.out.println(n + "");
            return;
        }
        inc(n - 1);
        System.out.println(n + " ");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter N: ");
        int n = sc.nextInt();
        dec(n);
        inc(n);
    }
}
