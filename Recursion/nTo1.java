package Recursion;

import java.util.Scanner;

public class nTo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:-->");
        int n = sc.nextInt();
        printNto1(n);

    }

    public static void printNto1(int n) {
        if(n<1) return;
        System.out.println(n);
        printNto1(n-1);
    }
}
