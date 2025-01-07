package Recursion;

import java.util.Scanner;

public class sumParameterised {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n :-->> ");
        int n = in.nextInt();
        sum(n,0);
    }

    public static void sum(int n, int s ){
        if (n == 0){
            System.out.println(s);
            return;
        }
        sum(n-1,s+n);
    }
}
