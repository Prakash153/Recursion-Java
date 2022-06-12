package Recursion;

import java.util.Scanner;

public class SubsetSumProblem {
    static int SSP(int n, int a[], int sum) {
        if (n == 0) {
            return (sum == 0) ? 1 : 0;
        }
        return SSP(n - 1, a, sum) + SSP(n - 1, a, sum - a[n - 1]);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size of array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.printf("sum: ");
        int sum = sc.nextInt();
        System.out.printf("total subsets having sum as %d are %d", sum, SSP(n, a, sum));
    }
}
