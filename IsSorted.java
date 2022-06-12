package Recursion;

import java.util.Scanner;

// another method
/*return a[n - 1] >= a[n - 2]
            && arraySortedOrNot(a, n - 1);*/
public class IsSorted {
    static boolean isSorted(int a[], int n) {
        if (n == 0 || n == 1) {
            return true;
        }
        if (a[n - 1] < a[n - 2]) {
            return false;
        }
        return isSorted(a, n - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size of array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (isSorted(a, n)) {
            System.out.printf("Array is sorted");
        } else {
            System.out.printf("Array is not sorted");
        }
    }
}
