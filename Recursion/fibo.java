package Recursion;

import java.util.Scanner;

public class fibo  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println(Fibo(n));
    }

    private static int Fibo(int n) {
        if (n<=1) return n;
        return Fibo(n-1)+Fibo(n-2);
    }
}
