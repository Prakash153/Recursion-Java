package Recursion;

import java.util.Scanner;

public class SumOfN {
    public static int Sum(int n) {
        if (n == 0) {
            return 0;
        }
        int preSum = Sum(n - 1);
        return n + preSum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("value of N :");
        int n = sc.nextInt();
        int sum = Sum(n);
        System.out.printf("%d", sum);
    }
}
