public class functionCalls {
    public static void main(String[] args) {
        System.out.println("Hi I am in main");
        apple();
        System.out.println("Hi I am in main");
    }

    public static void mango() {
        System.out.println("Hi I am in Mango");
    }
    public static void banana() {
        mango();
        System.out.println("Hi I am in Banana");
        mango();
    }
    public static void apple() {
        banana();
        System.out.println("Hi I am in Apple");
        mango();
    }
}

/*
Outputs according to function calls
Hi I am in main
Hi I am in Mango
Hi I am in Banana
Hi I am in Mango
Hi I am in Apple
Hi I am in Mango
Hi I am in main

 */
