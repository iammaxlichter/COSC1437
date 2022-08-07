package CHAPTER8;

import java.util.Scanner;
public class BirthdayReminder {

    public static void main(String[] args){
        int size = 10;
        String[] names = new String[size];
        String[] birthdates = new String[size];
        int count = 0;
        boolean done = false;
        Scanner input = new Scanner(System.in);
        String name;

        while(count < size && !done){

            System.out.print("Enter name (enter ZZZ if done): ");
            name = input.nextLine();

            if(name.equalsIgnoreCase("ZZZ"))
                done = true;
                
            else{
                names[count] = name;
                System.out.print("Enter birthdate: ");
                birthdates[count] = input.nextLine();
                count++;
            }
        }

        System.out.println("You have entered " + count + " names");
        
        for(int i =0;i < count; i++)
            System.out.println(names[i]);

        System.out.println();

        do{

            System.out.print("Enter a name whose birthdate is needed: ");
            name = input.nextLine();

            if(!name.equalsIgnoreCase("ZZZ")){
                int index = -1;
                for(int i= 0; i < count; i++){
                    if(names[i].equalsIgnoreCase(name)){
                        index = i;
                        break;
                    }
                }

                if(index == -1)
                    System.out.println("Sorry, no entry for "+ name);
                else
                    System.out.println(name +"'s birthdate is " + birthdates[index]);
            }
        } while(!name.equalsIgnoreCase("ZZZ"));

        input.close();
    }
}