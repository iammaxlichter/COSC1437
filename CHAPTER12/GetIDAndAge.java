package CHAPTER12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetIDAndAge {

    public static void main(String[] args) {

        int id = -1, age = -1;
        Scanner keyboard = new Scanner(System.in);

        do {
            try {
            
                System.out.print("Enter ID: ");
                id = keyboard.nextInt();
                System.out.print("Enter age: ");
                age = keyboard.nextInt();


                if(age != 0 || id != 0) {
                    if(age < 0 || age > 119)
                        throw (new DataEntryException(age));
                    if(id < 0 || id > 999)
                        throw (new DataEntryException(id));

                    System.out.println("ID and Age OK.");
                }
            } catch(InputMismatchException e)

            {
                System.out.println("Invalid data type");
                keyboard.nextLine(); // discard the "\n" left by nextInt
            }catch(DataEntryException e)

            {
                System.out.println(e.getMessage());
            }

        }while(!(id == 0 && age == 0));

        keyboard.close();
    }
}
