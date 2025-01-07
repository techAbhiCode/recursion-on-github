package Recursion;

import java.util.Scanner;

public class nTo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:-->");
        int n = sc.nextInt();
        System.out.println("this is from n to 1");
        printNto1(n);

        System.out.println("this is from 1 to n");
        print1_N(n);

    }

    public static void printNto1(int n) {
        if(n<1) return;    // or (n==0)  base condition is very important in recursion
        System.out.println(n);    // if we exchange the line numnber 16 and 17 then it will print 1 to n
        printNto1(n-1);
    }

    public static void print1_N(int n) {
       if (n<1) return;
       print1_N(n-1);
       System.out.println(n);
    }
}

/*
Enter n:-->
6
this is from n to 1
6
5
4
3
2
1
this is from 1 to n
1
2
3
4
5
6

*/