package Recursion;

import java.util.Scanner;

//Find the first and last occurrence of an element in an array
public class FirstLastOccurence {
    static int firstocc(int a[], int n, int i, int key) {
        if (i == n) {
            return -1;
        }
        if (a[i] == key) {
            return i;
        }
        return firstocc(a, n, i + 1, key);
    }

    static int lastocc(int a[], int n, int i, int key) {
        if (i == n) {
            return -1;
        }
        int restArray = lastocc(a, n, i + 1, key);
        if (restArray != -1) {
            return restArray;
        }
        if (a[i] == key) {
            return i;
        }
        return -1;
    }

    public static void main(String args[]) {
        System.out.printf("size of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.printf("key :");
        int key = sc.nextInt();
        System.out.println(firstocc(a, n, 0, key));
        System.out.println(lastocc(a, n, 0, key));
    }
}
