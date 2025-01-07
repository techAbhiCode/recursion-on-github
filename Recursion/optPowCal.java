package Recursion;

import java.util.Scanner;

// optimized solution of power calculation

public class optPowCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int a = sc.nextInt();
        System.out.println("Enter the power: "  );
        int b = sc.nextInt();
        System.out.println(a + " raised to power " + b + " is " + power(a,b));
    }

    private static int power(int a, int b) {
        if(b==0) return 1;
        int ans = power(a,b/2);
        if(b%2==0) return ans*ans;
        else return ans*ans*a;
    }
}
