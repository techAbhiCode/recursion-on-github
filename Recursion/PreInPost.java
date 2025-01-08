package Recursion;

import java.util.Scanner;

public class PreInPost {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        pip(n);
    }

    public static void pip(int n) {
        if (n == 0) return;
        System.out.println("Pre "+n);  //Pre
        pip(n - 1);
        System.out.println("in " +n); // In
        pip(n - 1);
        System.out.println("Post "+n);  //post
    }
}
