package Recursion;

import java.util.Scanner;


public class RopeCuttingProblem {
    static int maxPieces(int n, int a, int b, int c) {
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return -1;
        }
        int res = Math.max(maxPieces(n - a, a, b, b), (Math.max(maxPieces(n - b, a, b, c), maxPieces(n - c, a, b, c))));
        if (res == -1) {
            return -1;
        } else {
            return res + 1;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter the lenth of rope :");
        int n = sc.nextInt();
        System.out.printf("enter the length of pieces :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(maxPieces(n, a, b, c));
    }
}
