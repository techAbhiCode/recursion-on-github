package Recursion;

import java.util.Scanner;

public class sumWithRec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = in.nextInt();
        System.out.println(sum(n));
    }

    private static int sum(int n) {
        if (n == 0) return 0;
        int ans = n + sum(n-1);
        return ans;
    }
}

