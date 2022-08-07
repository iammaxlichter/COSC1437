package CHAPTER13;

import java.nio.file.*; //used to manipulate files
import java.io.*; //needs to find a class you are using
import java.nio.channels.FileChannel;//Using a file channel you can read data from a file, and write data to a file
import java.nio.ByteBuffer;//abstract class which also happens to extend Buffer and implement Comparable
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner; //for input
import java.text.*;
public class CreateBankFile 
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in); //for input of file through Scanner
      Path file = Paths.get("BankAccounts.txt");//get the path of file
      String s = "0000,        ,00000.00" + System.getProperty("line.separator"); //separate line in given format
      final int RECSIZE = s.length(); //length of string in each line of file
      FileChannel fc = null;  
      final int NUMRECS = 10000; //total accounts
      String delimiter = ","; //use ',' as a separator
      String idString; //id of account
      int id;
      String name; //lname of account user
      double balance; //account balance
      final String QUIT = "9999"; //quit if user enters 9999
      try
      {
         OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
         BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output)); //use bufferedWriter to write in file
         for(int count = 0; count < NUMRECS; ++count) //loop till 10000 all account numbers
             writer.write(s, 0, s.length()); //write all sefault value of account details
         writer.close(); //close the writer
      }
      catch(Exception e)
      {
          System.out.println("Error message: " + e); //catch the exception if try fails
      }try
      {
         fc = (FileChannel)Files.newByteChannel(file, CREATE, WRITE); //file descriptor to write account details
         
         System.out.print("Enter 4-digit customer account number >> ");
         idString = input.nextLine(); //enter the account number of user as string
         while(!(idString.equals(QUIT))) //loop till 10000
         {
            id = Integer.parseInt(idString); //convert string to integer
            System.out.print("Enter name for customer >> ");
            name = input.nextLine(); //enter the name of user
            StringBuilder sb = new StringBuilder(name);//used to create mutable (modifiable) string
            sb.setLength(8);
            name = sb.toString(); //mutable name
            System.out.print("Enter balance >> ");
            balance = input.nextDouble(); //input account balance from user 
            input.nextLine();
            DecimalFormat df = new DecimalFormat("00000.00"); //account balance format
            s = idString + delimiter + name + delimiter + df.format(balance) + System.getProperty("line.separator");//complete string in each line
            byte data[] = s.getBytes(); //convert string to byte 
            ByteBuffer buffer = ByteBuffer.wrap(data); //ByteBuffer Class is used to wraps a byte array into a buffer.
            fc.position(id * RECSIZE); //set position where to write in file
            fc.write(buffer);//write to file
            System.out.print("Enter next customer account number or " + QUIT + " to quit >> ");//if enter 9999 then quit
            idString = input.nextLine();//input next account number
         }
         fc.close(); //close the file
      }
      catch (Exception e)
      {
          System.out.println("Error message: " + e); //otherwise catch exception here
      }
      input.close();
   }
}