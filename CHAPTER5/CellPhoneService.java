package CHAPTER5;

import java.util.*;
public class CellPhoneService {
    public static void main (String args[]) {
        
        int TalkMinutes, Texts, Gigabytes;

        Scanner SC = new Scanner(System.in);

        System.out.println("Enter talk minutes needed");
        TalkMinutes = SC.nextInt();

        System.out.println("Enter text messages needed");
        Texts = SC.nextInt();

        System.out.println("Enter gigabytes of data needed");
        Gigabytes = SC.nextInt();

        SC.close();

        if (Gigabytes >= 3){
            System.out.println("Plan F $87 per month");
            System.exit(0);
        }
        else if (Gigabytes < 3 && Gigabytes >= 1){
            System.out.println("Plan E $79 per month");
            System.exit(0);
        }
        else if (Gigabytes == 0){
            if (TalkMinutes >= 500){
                if (Texts < 100 && Texts >= 0){
                     System.out.println("Plan C $61 per month");
                }
                else if (Texts >= 100){
                      System.out.println("Plan D $70 per month");
                }
            }
    
            else if (TalkMinutes < 500){
                if (Texts > 0){
                    System.out.println("Plan B $55 per month");
                }
                else if (Texts == 0){
                    System.out.println("Plan A $49 per month");
                }
            }      
        }
    }
}
