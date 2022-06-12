package Recursion;

import java.util.Scanner;

public class ReverseArray {
    static void reverse(int n, int a[], int i) {
        if (i == n - 1) {
            System.out.print(a[i] + " ");
            return;
        }
        reverse(n, a, i + 1);
        System.out.print(a[i] + " ");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size of array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        reverse(n, a, 0);
    }
}
