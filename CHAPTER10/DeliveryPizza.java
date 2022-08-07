package CHAPTER10;

public class DeliveryPizza extends Pizza {
    private double deliveryFee;
    private String address;
    
    public DeliveryPizza(String description, double price, String address){ // parameterised constrcutor
        super(description, price);
        this.address = address;
        if(price > 15)
         deliveryFee = 3.00;
        else 
         deliveryFee = 5.00;
    }
    
    public void display(){ // method display
        super.display();
        System.out.println("    Deliver to: " + address + ". Fee is " + deliveryFee);
    }
}
