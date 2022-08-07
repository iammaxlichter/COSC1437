package ProgrammingAssignments;

/*This program is the main for Assignment1.java. In this main, the user obtains the grade average and caluclates
 * what actual grade the user gets based upon that number */
public class TestAssignment1 {

    public static void main(String args[]){

        //Creating my object and storing the method used to calculate the average into a variable
        Assignment1 Student = new Assignment1();
        int GRADE = Student.getGrade();

        /*This sequence of code, lines 12-26 determine what final grade the user will receive using logic properties */
        if (GRADE >= 90 && GRADE <= 100){
            System.out.println("\nWith an average quiz grade of: " + GRADE + ",\nYour final grade is: A.\n");
        }
        else if (GRADE >= 80 && GRADE <= 89){
            System.out.println("\nWith an average quiz grade of: " + GRADE + ",\nYour final grade is: B.\n");
        }
        else if (GRADE >= 70 && GRADE <= 79){
            System.out.println("\nWith an average quiz grade of: " + GRADE + ",\nYour final grade is: C.\n");
        }
        else if (GRADE >= 60 && GRADE <= 69){
            System.out.println("\nWith an average quiz grade of: " + GRADE + ",\nYour final grade is: D.\n");
        }
        else if (GRADE > 0 && GRADE <= 59){
            System.out.println("\nWith an average quiz grade of: " + GRADE + ",\nYour final grade is: F.\n");
        }

        /*This final else if statement is for if the user types 999 right off the bat. Chances are, the user isn't just going to have
        multiple quiz grades of only zero, so instead, this special message pops up because the user likely just wanted to exit the program fast,
        but int turn, the grade receives is an F */
        else if(GRADE == 0){
            System.out.println("\nUnless you just received very poor grades, you likely exitted the program without");
            System.out.print("importing any grades, thus making your average quiz grades an average of: " + GRADE + ",\nand your final grade an F.\n");
        }

    }
}
