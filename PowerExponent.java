package Recursion;

import java.util.Scanner;

public class PowerExponent {
    public static int Power(int n, int p) {
        if (p == 0) {
            return 1;
        }
        int prevPower = Power(n, p - 1);
        return n * prevPower;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("value of number : ");
        int n = sc.nextInt();
        System.out.printf("value of power :");
        int p = sc.nextInt();
        int ans = Power(n, p);
        System.out.printf("%d", ans);
    }
}
