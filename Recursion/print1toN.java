package Recursion;

import java.util.Scanner;

public class print1toN {
    static int n;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = in.nextInt();
        print1_n(1);
    }

    public static void print1_n(int x) {
        if (x>n) {
            return;
        }else
            System.out.print(x + " ");
        print1_n(x+1);
    }
}
