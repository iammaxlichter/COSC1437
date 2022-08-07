package CHAPTER7;

import java.util.*;
public class CountSpaces2
{
    public static void main(String[] args)
    {
        String Quote;

        Scanner SC = new Scanner(System.in);
        System.out.print("Enter an inspirational quote >> ");
        Quote = SC.nextLine();

        SC.close();
        
        int Count = calculateSpaces(Quote);

        System.out.println("The number of white spaces is " + Count);
    }
    public static int calculateSpaces(String inString){

        int count = 0;

        for(int i = 0; i < inString.length(); i++){
            if(inString.charAt(i) == ' ') {
                count++;
            }
        }

        return count;
    }
}
