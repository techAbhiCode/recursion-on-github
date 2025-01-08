package Recursion;

import java.util.Scanner;

public class Zig_zag{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to create zig zag: ");
        int n = in.nextInt();
        zigzag(n);
    }
    public static void zigzag(int n) {
        if (n == 0) return;
        System.out.print(n);  //Pre
        zigzag(n - 1);
        System.out.print(n); // In
        zigzag(n - 1);
        System.out.print(n);  //post
    }
}
