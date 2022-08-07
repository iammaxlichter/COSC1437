package CHAPTER5;

import java.util.*;
import java.time.*;
public class PastPresentFuture2
{
  public static void main (String args[]) 
  {
      LocalDate today = LocalDate.now();
      LocalDate enteredDate;

      int mo, da, yr;
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a month >> ");
      mo = input.nextInt();
      System.out.print("Enter a day >> ");
      da = input.nextInt();
      System.out.print("Enter a year (four digits) >> ");
      yr = input.nextInt();

      input.close();

      enteredDate = LocalDate.of(yr,mo,da);

      if(enteredDate.isBefore(today)){
        System.out.println(enteredDate + " is in the past ");
      }
      else if(enteredDate.isAfter(today)){
        System.out.println(enteredDate + " is in the future ");
      }
      else if(enteredDate.equals(today)){
        System.out.println(enteredDate + " is todays date");
      }





   }
}


