package CHAPTER7;

import java.util.Scanner;
public class CountWords {

    static final int m = 0;
    static final int n = 1;

    public static void main(String args[]) {
        System.out.println("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("No of words in the string ' "+str+" ' is " + str_wordcount(str));
        sc.close();
    }

    static int str_wordcount(String str) {   

        int grant = m;
        int word_count = 0 , i=0;

        while (i < str.length()) {
            if (str.charAt(i) == ' ' || str.charAt(i) == ',' || str.charAt(i) == '?'|| str.charAt(i) == '!'|| str.charAt(i) == '_' || str.charAt(i) == '-' || str.charAt(i) == ':'|| str.charAt(i) == ';'|| str.charAt(i) == '.'|| str.charAt(i) == '/')
                grant = m;
            else if (grant == m) {
                grant = n;
                ++word_count;
                }
            ++i;
            }       
        return word_count;
    }
}