package CHAPTER3;

public class NumbersDemo {
    public static void main (String args[]) {
        displayTwiceTheNumber(4);
        displayNumberPlusFive(4);
        displayNumberSquared(4);
    }
    public static void displayTwiceTheNumber(int n) {
        n = n * 2;
        System.out.println(n/2 + " times 2 is " + n);
    }
    public static void displayNumberPlusFive(int n) {
        n = n + 5;
        System.out.println(n-5 + " plus 5 is " + n);
    }
    public static void displayNumberSquared(int n) {
        n = n * n;
        System.out.println(Math.sqrt(n) + " squared is " + n);

    }
}
