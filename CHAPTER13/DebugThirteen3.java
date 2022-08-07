package CHAPTER13;

import java.nio.file.*;
import java.io.*;
import java.util.Scanner;

public class DebugThirteen3 {
    public static void main(String[] args) throws Exception {

        Path file = Paths.get("/root/sandbox/DebugData4.txt"); 
        Scanner kb = new Scanner(System.in);
        String string = "";
        String delimiter = ",";
        String entree;
        String price;
        final String QUIT = "ZZZ";

        try
        {
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            System.out.print("Enter first entree or " + QUIT + " to quit >> ");
            entree = kb.nextLine();

            while(!entree.equals(QUIT)) {
                System.out.print("Enter price >> ");
                price = kb.nextLine();
                string = entree + delimiter + price +
                System.getProperty("line.separator");
                writer.write(string, 0, string.length());
                System.out.print("Enter next entrée or " + QUIT + " to quit >> ");
                entree = kb.nextLine();
            }
            writer.close();
        }
        catch(Exception e) {
            System.out.println("Message: " + e);
        }
        kb.close();
    }
}
