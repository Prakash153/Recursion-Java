package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    static void toh(int n, String a, String c, String b) {
        if (n == 1) {
            System.out.printf("move disk 1 from A to C");
            System.out.println("");
            return;
        }
        toh(n - 1, a, c, b);
        System.out.printf("move disk %d from %s to %s", n, a, c);
        System.out.println("");
        toh(n - 1, b, a, c);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("number of disks: ");
        int n = sc.nextInt();
        System.out.printf("source :");
        String a = sc.next();
        System.out.printf("destination :");
        String c = sc.next();
        System.out.printf("auxiliary :");
        String b = sc.next();
        toh(n, a, c, b);

    }
}
