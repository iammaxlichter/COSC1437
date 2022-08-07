package CHAPTER10;

import java.util.*;

public class DebugTen3 {
    public static void main(String[] args) {
        String area, inStr;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter city for phone book");
        area = input.next();
        System.out.println("Enter number of pages in " + area + "'s phone book");
        inStr = input.next();
        int pages = Integer.parseInt(inStr);
        DebugPhoneBook pb = new DebugPhoneBook(pages, area);
        pb.display();
        input.close();
    }

}