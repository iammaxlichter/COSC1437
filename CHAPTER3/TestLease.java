package CHAPTER3;

import java.util.Scanner ;
public class TestLease {

public static void showValues(Lease ls) {

    System.out.println("\n\nYour lease results:" +
    
    "\nName : " + ls.getName() +
    "\nApartment : " + ls.getAptNumber() +
    "\nRent : " + ls.getRent() +
    "\nTerm : " + ls.getTerm() );
}

public static void main(String[] args) {

    Lease l1, l2, l3, l4;

    l1 = getData();
    l2 = getData();
    l3 = getData();
    l4 = new Lease();

    showValues(l1);
    l1.addPetFee();
    showValues(l1);

    showValues(l2);
    l2.addPetFee();
    showValues(l2);

    showValues(l3);
    l3.addPetFee();
    showValues(l3);

    showValues(l4);
    l4.addPetFee();
    showValues(l4);
}

public static Lease getData() {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter lease name >> ");
    String name = sc.nextLine();
    System.out.print("Enter apartment number >> ");
    int aptNum = sc.nextInt();
    System.out.print("Enter rent >> ");
    double rent = sc.nextDouble();
    System.out.print("Enter lease term in month >> ");
    int term = sc.nextInt();

    sc.close();

    return new Lease(name, aptNum, rent, term);
}

}
