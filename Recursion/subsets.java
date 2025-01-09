package Recursion;

public class subsets {
    public static void main(String[] args) {
        String s = "abcd";
        printSubsets(0,s,"");
    }

    public static void printSubsets(int i, String s, String ans) {
        if (i == s.length()) {
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(i);
        printSubsets(i+1, s, ans+ch);  //take
        printSubsets(i+1, s, ans);                 //not take
    }
}
