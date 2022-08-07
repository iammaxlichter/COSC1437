package CHAPTER13;

import java.nio.file.*;//used to manipulate files
import java.io.*;//needs to find a class you are using
public class ReadBankAccountsSequentially
{
   public static void main(String[] args)
   {
      Path file =Paths.get("BankAccounts.txt");//get the file path
      String[] array = new String[3]; //create an array to record all 3 details of user
      String s = "";
      String delimiter = ","; //',' is used as delimiter
      int id;
      String stringId; //user id
      String name; //user name
      double balance; //user balance
      try
      {
         InputStream input = new BufferedInputStream(Files.newInputStream(file)); ////create new input stream
         BufferedReader reader = new BufferedReader(new InputStreamReader(input)); //bufferedReader to read data from file
         System.out.println();  //print new line    
         s = reader.readLine(); //read a line from file
         while(s != null) //loop  till string is not null
         {
            array = s.split(delimiter); //separate the value by ',' and store in array
            stringId = array[0]; //get user id
            id = Integer.parseInt(array[0]);//connvert user id to integer
            if(id !=  0) //if user id is not zero
            {
               name = array[1]; //get name
               balance = Double.parseDouble(array[2]);//get balance of user
               System.out.println("ID#" + stringId + "  " + name + "   $" + balance); //print all details sequentially
            }
            s = reader.readLine();  //read next line
         }
         reader.close(); //close the file
      }
      catch(Exception e)
      {
         System.out.println("Message: " + e); //catch exception here
      }
   }
}
