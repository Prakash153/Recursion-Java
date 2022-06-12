package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static int Fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return Fibo(n - 2) + Fibo(n - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter N : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", Fibo(i));
        }
    }
}
