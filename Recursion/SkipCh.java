package Recursion;

public class SkipCh {
    public static void main(String[] args) {
        String s = "Data analyze";
        System.out.println(s);
        skipa(0, s, " ");
    }

    public static void skipa(int i, String s, String ans) {
        if (i == s.length()) {
            System.out.println("String After removing character a: "+ans);
            return;
        }
        if (s.charAt(i)!= 'a') ans += s.charAt(i);
        skipa(i + 1, s, ans);
    }
}
