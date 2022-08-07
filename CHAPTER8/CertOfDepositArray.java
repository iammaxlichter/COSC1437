package CHAPTER8;

import java.util.Scanner;
public class CertOfDepositArray {

	public static void main(String[] args) {	
		CertOfDeposit cdArray[]=new CertOfDeposit[5];
		input(cdArray);
		display(cdArray);
	}
	public static void input(CertOfDeposit arr[]) {
		Scanner sc=new Scanner(System.in);
		String certNum;
		String lastName;
		double balance;
		int monthOfIssue;
		int dayOfIssue;
		int yearOfIssue;
		for(int i=0;i<arr.length;i++) {

			System.out.println("Enter certificate number");
			certNum=sc.nextLine();

			System.out.println("Enter last name of owner");
			lastName=sc.nextLine();

			System.out.println("Enter balance");
			balance=Double.parseDouble(sc.nextLine());

			System.out.println("Enter month of issue");
			monthOfIssue=Integer.parseInt(sc.nextLine());

			System.out.println("Enter day of issue");
			dayOfIssue=Integer.parseInt(sc.nextLine());

			System.out.println("Enter year of issue");
			yearOfIssue=Integer.parseInt(sc.nextLine());

			arr[i]=new CertOfDeposit(certNum,lastName,balance,monthOfIssue,dayOfIssue,yearOfIssue);
		}
		sc.close();
	}
	public static void display(CertOfDeposit arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print("Certificate "+arr[i].getCertNum());
			System.out.print("\nName: "+arr[i].getLastName());
			System.out.println(" Balance: $"+arr[i].getBalance());
			System.out.println("Issued: "+arr[i].getIssueDate());
			System.out.println("Matures: "+arr[i].getMaturityDate());
			
		}
	}

}
