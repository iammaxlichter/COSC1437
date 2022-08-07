package CHAPTER7;

import java.util.*;
public class Alphabetize {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);

        System.out.print("Enter three words: ");

        String Str1 = SC.next(), Str2 = SC.next(), Str3 = SC.next();

        if (Str1.compareTo(Str2) <= 0 && Str2.compareTo(Str3) <= 0) {
            System.out.println("You entered the strings in alphabetical order");
        } 
        else {
            System.out.println("You did not enter the words in alphabetical order");
        }

        SC.close();
    }
}