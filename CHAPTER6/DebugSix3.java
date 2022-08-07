package CHAPTER6;

// Prompt user for value to start
// Value must be between 1 and 20 inclusive
// At command line, count down to blastoff
// With a brief pause between each displayed value
import java.util.*;
public class DebugSix3
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String userNumString;
    int userNum, val;
    final int MIN = 1;
    final int MAX = 20;
    System.out.println("Enter a number between " + MIN + " and " + MAX + " inclusive");
    userNumString = input.next();
    userNum = Integer.parseInt(userNumString);
    
    while(userNum < MIN || userNum > MAX)
    {
       System.out.println("Number out of range" +
       "\nEnter a number between " + MIN + " and " + MAX + " inclusive");
       userNumString = input.next();
       userNum = Integer.parseInt(userNumString);
    }
    input.close();
    for(val = userNum; val >= 1; --val)
    {
      System.out.print(val + "  ");
      for(int x = 0; x < 100000; ++x)
        for(int y = 0; y < 10000; ++y);
        // Adjust these numbers for faster or slower performance
    }
    System.out.println("Blastoff!");

  }
}






