package Recursion;

import java.util.Scanner;

// n is starting from 1
public class JosephusProblem {
    static int josephus(int n, int k) {
        if (n == 1) {
            return 1;
        }
        return (josephus(n - 1, k) + k - 1) % n + 1;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("number of people in the circle: ");
        int n = sc.nextInt();
        System.out.printf("kth position :");
        int k = sc.nextInt();
        System.out.println("Survivor : " + josephus(n, k));
    }
}
