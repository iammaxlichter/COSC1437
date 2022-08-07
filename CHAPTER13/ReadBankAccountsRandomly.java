package CHAPTER13;

import java.nio.file.*;//used to manipulate files
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
public class ReadBankAccountsRandomly
{
   public static void main(String[] args)  
   {
      Scanner keyBoard = new Scanner(System.in);
      Path file = Paths.get("BankAccounts.txt"); //read file by passing path as input
      String s = "0000,        ,00000.00" + System.getProperty("line.separator"); //separate lien suing line separator
      final int RECSIZE = s.length(); //length of string
      byte data[] = s.getBytes(); //getBytes() method encodes a given String into a sequence of bytes and returns an array of bytes
      ByteBuffer buffer = ByteBuffer.wrap(data);//ByteBuffer Class is used to wraps a byte array into a buffer.
      FileChannel fc = null;
      String idString;
      int id;
      final String QUIT = "9999"; //string to quit the program if enters 9999
      try
      {
         fc = (FileChannel)Files.newByteChannel(file, READ, WRITE); //create file channel to read file
         System.out.print("Enter account number >> "); 
         idString = keyBoard.nextLine(); //input the account number of user
         while(!idString.equals(QUIT)) //loop until user enters 9999
         {
            id = Integer.parseInt(idString); //convert id to integer
            fc.position(id * RECSIZE); //get the location in file
            fc.read(buffer); //read the data from file
            buffer= ByteBuffer.wrap(data); //wrap a byte array into buffer
            s = new String(data); // convet to string all information
            System.out.println("ID #" + id + "  " + s); //print the details
            System.out.print("Enter next account number or " + QUIT + " to quit >> "); //if user enters 9999 then quit
            idString = keyBoard.nextLine(); //input next account number
         }
         fc.close(); //close the file
      }
      catch (Exception e)
      {
          System.out.println("Error message: " + e); //catch exception here
      }
      keyBoard.close();
   }
}
