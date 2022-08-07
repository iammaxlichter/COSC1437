package CHAPTER7;

import java.util.Scanner;

public class ThreeLetterAcronym {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String sentence = SC.nextLine();

        String[] words = sentence.split("\\s+");

        int i = 0;
        for (String NEW : words) {
            if (i < 3) {
                System.out.print((NEW.charAt(0) + "").toUpperCase());
                i++;
            }
        }
        SC.close();
    }
}