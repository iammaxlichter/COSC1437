package CHAPTER2;


import java.util.Scanner;

class ElectionStatistics
{
	public static void main (String[] args) throws java.lang.Exception
	{

		Scanner inputDevice = new Scanner(System.in);
		String party1, party2, party3;
		int votes1, votes2, votes3;

		System.out.print("Enter the name of Political Party 1: ");
		party1= inputDevice.nextLine();
		System.out.print("\nEnter the number of votes for "+ party1+": ");
		votes1=inputDevice.nextInt();
		inputDevice.nextLine();
		
		System.out.print("\nEnter the name of Political Party 2: ");
		party2= inputDevice.nextLine();
		System.out.print("\nEnter the number of votes for "+ party2+": ");
		votes2=inputDevice.nextInt();
		inputDevice.nextLine();
		
		System.out.print("\nEnter the name of Political Party 3: ");
		party3= inputDevice.nextLine();
		System.out.print("\nEnter the number of votes for "+ party3+ ": ");
		votes3=inputDevice.nextInt();
		
        inputDevice.close();
        
		double percent1,percent2,percent3;
		percent1=100*(1.0*votes1/(votes1+votes2+votes3));
		percent2=100*(1.0*votes2/(votes1+votes2+votes3));
		percent3=100*(1.0*votes3/(votes1+votes2+votes3));

		System.out.println("\nNumber of votes for "+ party1+": "+percent1+"%");
		System.out.println("Number of votes for "+ party2+": "+percent2+"%");
		System.out.println("Number of votes for "+ party3+": "+percent3+"%");
	}
}