package CHAPTER6;

import java.util.Scanner;
public class CountByAnything
{
    public static void main (String args[])
    {
        int START;
        final int STOP = 500;
        final int NUMBER_PER_LINE = 10;
        int temp = 0;

        Scanner scanner = new Scanner(System.in);
        START = scanner.nextInt();
        scanner.close();

        for(int i = START; i <= STOP; i += START) {
            System.out.print(i + "\t");
            temp++;

            if(temp % NUMBER_PER_LINE == 0){
                System.out.println();
                }
        }
        System.out.println();
  }
}