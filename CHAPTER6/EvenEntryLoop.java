package CHAPTER6;

import java.util.*;
public class EvenEntryLoop {
    public static void main (String args[]) {
        
        int Sentinel = 999;
        int even = 0;
        Scanner SC = new Scanner(System.in);

        while (even != Sentinel){

            
            even = SC.nextInt();

            if (even % 2 == 0){
                System.out.println("Good job!");
                }

            else if (even == 999){
                break;
            }
            
            else{
                System.out.println(even + " is not an even number");
                }
        }
        SC.close();
    }
}

