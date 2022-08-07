package CHAPTER13;

import java.nio.file.*;
import java.io.*;
import java.util.Scanner;

public class CreateCustomerFile {
    public static void main(String[] args) {

        Path file = Paths.get("Customers.txt");
        Scanner kb = new Scanner(System.in);
        String s = "";
        String delimiter = ",";
        String space = " ";
        String id;
        String lastName;
        int zipcode;
        final String QUIT = "999";

        try {

            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));

            System.out.print("Enter ID number or " + QUIT + " to quit >> ");
            id = kb.nextLine();

            while(!id.equals(QUIT)){

                System.out.print("Enter last name >> ");
                lastName = kb.nextLine();
                System.out.print("Enter zip code >> ");
                zipcode = kb.nextInt();
                kb.nextLine();

                

                if (lastName.length() >= 6 ){
                    lastName = lastName.substring(0,6);
                    s = id + delimiter + lastName + delimiter + zipcode + System.getProperty("line.separator");
                    writer.write(s, 0, s.length());
                }
                else{
                    lastName = padRight(lastName,5);
                    s = id + delimiter + lastName + space + delimiter + zipcode + System.getProperty("line.separator");
                    writer.write(s, 0, s.length());
                }
                System.out.print("Enter ID number or " + QUIT + " to quit >> ");
                id = kb.nextLine();
            }
            writer.close();
        }
        catch(Exception e) {
            System.out.println("Message: " + e);
        }
        kb.close();
    }

    public static String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);  
   }
}
