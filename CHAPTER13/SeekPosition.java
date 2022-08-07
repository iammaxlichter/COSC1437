package CHAPTER13;

import java.io.*;
import java.util.*;

public class SeekPosition {
    public static void main(String args[]) throws IOException {

        FileInputStream in = null;

        Scanner input = new Scanner(System.in);
        String infile;
        int seek=0,read=0;
        boolean good;

        System.out.print("Input filename: ");
        infile = input.nextLine();
        do {
            good = true;
            try {
                System.out.print("Input seek position: ");
                seek = input.nextInt();
            } 
            catch (InputMismatchException ex) {
                input = new Scanner(System.in);
                System.out.println("Please enter valid integer value.");
                good = false;
            }
        } while (!good);

        read = 20;

        try {
            in = new FileInputStream(infile);
            in.skip(seek);
            byte[] text=new byte[read];
            in.read(text,0,read);
            String s = new String(text);
            System.out.println(infile+" read "+read+" chars from "+seek+" position. :"+s);
        }

        finally {
            if (in != null) {
                in.close();
            }
        }
        input.close();
    }
}

