package CHAPTER7;

import java.util.*;
public class BabyNameComparison {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        String Str1, Str2, Str3;

        System.out.println("Enter a name >> ");
        Str1 = SC.nextLine();
        System.out.println("Enter a second name >> ");
        Str2 = SC.nextLine();
        System.out.println("Enter a third name >> ");
        Str3 = SC.nextLine();

        SC.close();

        System.out.println("The combinations are: ");

        System.out.println(Str1 + " " + Str2);
        System.out.println(Str1 + " " + Str3);
        System.out.println(Str2 + " " + Str1);
        System.out.println(Str3 + " " + Str1);
        System.out.println(Str2 + " " + Str3);
        System.out.println(Str3 + " " + Str2);
    }
}