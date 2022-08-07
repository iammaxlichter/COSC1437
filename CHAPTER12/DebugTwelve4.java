package CHAPTER12;

import java.util.*;

public class DebugTwelve4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String inStr, outString = "";
        final int MAX = 999;
        int[] emps = new int[4];

        for (int x = 0; x < emps.length; ++x) {
            System.out.println("Enter employee ID number");
            inStr = input.next();
            try {
                emps[x] = Integer.parseInt(inStr);
                if (emps[x] > MAX) {
                    throw (new DebugEmployeeIDException("Number too high " + emps[x]));
                }
            } catch (NumberFormatException error) {
                --x;
                System.out.println(inStr + "\nNonnumeric ID");
            }
        
            catch (DebugEmployeeIDException error) {
                --x;
                System.out.println(error.getMessage());
            }
        }

        for (int x = 0; x < emps.length; ++x) {
            outString = outString + emps[x] + " ";
        }

        input.close();
        System.out.println("Four valid IDS are: " + outString);
    }
}