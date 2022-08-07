package CHAPTER8;

import java.util.Scanner;

public class PurchaseArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Purchase items[] = new Purchase[5];
        int invoiceNum;
        double sale;

        for(int i=0;i<5;i++){

            System.out.print("Enter invoice number >> ");
            invoiceNum = sc.nextInt();

            while(invoiceNum<1000 || invoiceNum>8000){
                System.out.println("Error!!! Invoice number should be between 1000-8000 inclusive");
                System.out.print("Enter invoice number : ");
                invoiceNum = sc.nextInt();
            }

            System.out.print("Enter sale amount >> ");
            sale = sc.nextDouble();

            while(sale<00){
                System.out.println("Error! Sale amount should be greater than $0");
                System.out.print("Enter sale amount : ");
                sale = sc.nextDouble();
            }

            items[i] = new Purchase();
            items[i].setInvoiceNumber(invoiceNum);
            items[i].setSaleAmount(sale);
        }

        sc.close();
        System.out.println("Item details are as below");

        for(int i=0;i<5;i++){
            items[i].display();
        }
    }
}