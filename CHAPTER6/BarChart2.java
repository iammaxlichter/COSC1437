package CHAPTER6;

import java.util.Scanner;
public class BarChart2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int artPoints;
        int bobPoints;
        int calPoints;
        int danPoints;
        int eliPoints;

        String Art = "Art";
        String Bob = "Bob";
        String Cal = "Cal";
        String Dan = "Dan";
        String Eli = "Eli"; 

        System.out.print("Enter points earned by Art >> ");
        artPoints = input.nextInt();
        System.out.print("Enter points earned by Bob >> ");
        bobPoints = input.nextInt();
        System.out.print("Enter points earned by Cal >> ");
        calPoints = input.nextInt();
        System.out.print("Enter points earned by Dan >> ");
        danPoints = input.nextInt();
        System.out.print("Enter points earned by Eli >> ");
        eliPoints = input.nextInt();
        System.out.println("\nPoints for Game\n");

        input.close();

        drawChart(Art,artPoints);
        drawChart(Bob,bobPoints);
        drawChart(Cal,calPoints);
        drawChart(Dan,danPoints);
        drawChart(Eli,eliPoints);
    }
    public static void drawChart(String name, int points) {

        System.out.print(name + "  ");
        for (int i = 0 ; i < points/10 ; i++){
            System.out.print("*");
        }
        System.out.println();

        
    }
}