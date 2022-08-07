package CHAPTER7;

import java.util.Scanner;

public class PigLatin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("The Pig latin is: " + pigLatin(str));
        sc.close();
    }

    public static boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    static String pigLatin(String s) {
        int len = s.length();
        int index = -1;

        for (int i = 0; i < len; i++) {
            if (isVowel(s.charAt(i)) || (i > 0 && s.charAt(i) == 'y')) {
                index = i;
                break;
           }
        }

        if (index == -1)
            return "-1";
            return s.substring(index) +
            s.substring(0, index) + "ay";
    }

}
