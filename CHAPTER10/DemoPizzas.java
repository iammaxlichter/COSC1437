package CHAPTER10;

public class DemoPizzas {
    public static void main(String[] args){
        
        Pizza pdi1 = new Pizza("Sausage and onion", 17.99);
        pdi1.display();
        Pizza pdi2 = new Pizza("Veggies", 13.99);
        pdi2.display();

        DeliveryPizza dpdi1 = new DeliveryPizza("sausage and onion",14.99,"A street H-Block"); 
        dpdi1.display(); 
        DeliveryPizza dpdi2 = new DeliveryPizza("pineapple and cheese",18.99,"Flat-28, Tower A, Dupont Circle"); 
        dpdi2.display(); 
    }
}
