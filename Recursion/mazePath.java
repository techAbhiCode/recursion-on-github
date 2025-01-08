package Recursion;

import java.util.Scanner;

public class mazePath {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter m: ");
        int m = in.nextInt();
        System.out.println("Enter n: ");
        int n = in.nextInt();
        System.out.println(maze(1,1,m,n));
        System.out.println(maze2(m,n));
    }

    public static int maze(int row, int col, int m, int n) {
        if (row == m || col == n) return 1;
        int rightWays = maze(row, col+1, m, n);
        int downWays = maze(row+1, col, m, n);
        return rightWays + downWays;
    }
    public static int maze2(int m, int n) {
        if (m==1 || n==1) return 1;
        int rightWays = maze2(m, n-1);
        int downWays = maze2(m-1, n);
        return rightWays + downWays;
    }
}
