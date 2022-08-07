package CHAPTER10;

public class DebugCustomer {

    protected int idNumber;
    protected String name;
    protected double credit;
    
    DebugCustomer(int id, String name, double creditLimit) {
        idNumber = id;
        this.name = name;
        credit = creditLimit;
    }
    
    void display() {
        System.out.println("Customer #" + idNumber + " Name: " + name + "\nCredit limit $" + credit);
    }
}
    