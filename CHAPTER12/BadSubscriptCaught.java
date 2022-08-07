package CHAPTER12;

import java.util.*;
public class BadSubscriptCaught
{
   public static void main(String[] args)
   {
      String[] names = {"Ariel", "Brad", "Clifford", "Denise", "Emily",
        "Fred", "Gina", "Henry"};
      Scanner keyboard = new Scanner(System.in);
      int number;
     
      try{
          System.out.println("Enter a number and I will display a name");
          number = keyboard.nextInt();
          System.out.println(names[number]);
      }
      catch(Exception e)
      {
          System.out.println("Subscript out of range.");
      }
      keyboard.close();
   }
}
