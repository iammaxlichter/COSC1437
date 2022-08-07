package CHAPTER4;

class FormLetterWriter {
    public static void main(String[] args) {
        displaySalutation("Kelly");
        displayLetter();
        displaySalutation("Christy", "Johnson");
        displayLetter();
    }

    public static void displaySalutation(String lastName) {
        System.out.println("Dear Mr. or Ms. " + lastName + ",");
        System.out.println("\tThank you for your recent order.");
    }

    public static void displaySalutation(String firstName, String lastName) {
        System.out.println("Dear " + firstName + " " + lastName + ",");
        System.out.println("\tThank you for your recent order.");
    }
    public static void displayLetter() {
        // Write your code here
    }
}
