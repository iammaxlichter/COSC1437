package CHAPTER10;

import java.util.Scanner;

public class Person {

private String firstName;
private String lastName;
private String address;
private String zip;
private String phone;

public Person() {

setData();
}

public void setData() {

try (Scanner scan = new Scanner(System.in)) {
    System.out.print("Enter the Person's first name: ");
    this.firstName = scan.nextLine();
    System.out.print("Enter the Person's last name: ");
    this.lastName = scan.nextLine();
    System.out.print("Enter the Person's address: ");
    this.address = scan.nextLine();
    System.out.print("Enter the Person's zipcode: ");
    this.zip = scan.nextLine();
    System.out.print("Enter the Person's phone: ");
    this.phone = scan.nextLine();
}

}

public String display() {
return firstName + " " + lastName + " " + address + " " + zip + " " + phone;
}

}
