package Recursion;

import java.util.Scanner;

public class StairPath {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter path: ");
        int n = in.nextInt();
        System.out.println(stair(n));
    }

    private static int stair(int n) {
        if (n<=2) return n;
        return stair(n-1) + stair(n-2);
    }
}
