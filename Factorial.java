package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int Fact(int n) {
        if (n == 0) {
            return 1;
        }

        return n * Fact(n - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter number : ");
        int n = sc.nextInt();
        int ans = Fact(n);
        System.out.println("The factorial of " + n + " is " + ans);
    }
}
