package CHAPTER13;

import java.nio.file.*;
import java.io.*;
import java.util.Scanner;
public class WriteCustomerList {
    public static void main(String[] args) {

        Path file = Paths.get("CustomerList.txt");
        Scanner kb = new Scanner(System.in);
        String s = "";
        String delimiter = ",";
        String id;
        String firstName;
        String lastName;
        double balance;
        final String QUIT = "ZZZ";

        try {

            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));

            System.out.print("Enter ID number or " + QUIT + " to quit >> ");
            id = kb.nextLine();

            while(!id.equals(QUIT)){

                System.out.print("Enter first name >> ");
                firstName = kb.nextLine();
                System.out.print("Enter last name >> ");
                lastName = kb.nextLine();
                System.out.print("Enter balance >> ");
                balance = kb.nextDouble();
                kb.nextLine();

                s = id + delimiter + firstName + delimiter + lastName + delimiter + balance + System.getProperty("line.separator");
                writer.write(s, 0, s.length());

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
}
