package Recursion;

import java.util.Scanner;

public class RecursiveBinarySearch {
    static int binarySearch(int a[], int low, int high, int k) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (a[mid] == k) {
            return mid;
        } else if (a[mid] > k) {
            return binarySearch(a, low, mid - 1, k);
        } else {
            return binarySearch(a, mid + 1, high, k);
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size of array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.printf("element to be searched :");
        int k = sc.nextInt();
        System.out.println(binarySearch(a, 0, n - 1, k));
    }
}
