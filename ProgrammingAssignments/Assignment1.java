package ProgrammingAssignments;

/*This Program calculates the average quiz grades, and final grade of 10 or less quizzes that the user
enters. The user can exit the program at anytime with the numbers 999 and the numbers have to be within 0-100. */
import java.util.*;
public class Assignment1 {

    //This is the method that stores my grades in an array and returns them back to the main.
    public int getGrade(){

        //Creating and initializing my variables and array that will be used later.
        int Total = 0, Count = 0, Average = 0;
        int TotalGrades[] = new int[11];

        Scanner Input = new Scanner(System.in); //Creating a new scanner device for the inputting of grades.

        //Lines 45-58 prompt the user on whats the program is, what the parameters are, and how to exit the program.
        System.out.println("Welcome to the grade calculator.\n");
        System.out.print("Enter 999 if you are done inputting grades and you would like your final grade.\n");
        System.out.println("The program automatically calculates your grade after typing the 10th grade.\n");
        System.out.print("The program also only accepts numbers 0-100\n");

        /*This for loop asks the user for the grade, if it fits the parameters of whats acceptable (not 999 and between)
         * 0-100. */
        for(int i = 1 ; i<11 ; i++){

            //Prompting the user to enter the grade they desire, the program tells what # grade they are inputting.
            System.out.print("Enter grade #" + (i) + ". ");
            TotalGrades[i] = Input.nextInt();

            /*If the first grade they enter is 999, the scanner closes, the average grade returned is defaulted
             * to zero, and then it is returned to the main.*/
            if (TotalGrades[1] == 999){
                Input.close();
                return 0;
            }

            /*If the grade inputted is 999 in any other memory of the array, the program breaks and 
             * the grade is grade is calculated ending the program right then and there.*/
            else if (TotalGrades[i] == 999){
                break;
            }

            /*If the grade inputted is bigger than 100 or smaller than zero, the program will ask the user
             * for the grade at the same memory slot at which they just entered until the parameters are met.*/
            else if (TotalGrades[i] > 100 || TotalGrades[i] < 0){
                i--;
            }

            /*If the grades do fit all the parameters of what numbers are allowed and not allowed, we can
             * finally start storing the total of all the numbers inputted into a variable, along with a counter
             * which is then used to divide the two numbers together getting the average*/
            else if (TotalGrades[i] <= 100 || TotalGrades[i] >= 0){
                Total += TotalGrades[i];
                Count += 1;
            }
        }

        Input.close(); //Closing the scanner
        
        /*Calculating and returning the average by taking the total of all the numbers and dividing it by the # of numbers
         * which we were storing in the for loop previously*/
        Average = (Total)/(Count);
        return Average;
    }    
}

