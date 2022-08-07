package CHAPTER12;

import java.util.*;

public class PlaceAnOrder {
    public static void main(String[] args) {

        boolean isItemFound;
        int itemNum, itemQuantity;
        double totalAmount = 0;

        final int[] itemNumArr = {111, 222, 333, 444};
        final double[] itemPriceArr = {0.89, 1.47, 2.43, 5.99};

        Scanner sc = new Scanner(System.in);
    
        try {
            System.out.print("Enter an item number: ");
            if(sc.hasNextInt()) {
                itemNum = sc.nextInt();
                if(itemNum < 0) {
                    sc.close();
                    throw (new OrderException (OrderMessages.arrayOfErrormessage[2]));
                }

                if(itemNum > 9999) {
                    sc.close();
                    throw new OrderException (OrderMessages.arrayOfErrormessage[3]);

                }

                System.out.print("Enter the quantity of " + "an item: ");
                if(sc.hasNextInt()) {
                    itemQuantity = sc.nextInt();
                    if(itemQuantity < 1) {
                        sc.close();
                        throw new OrderException (OrderMessages.arrayOfErrormessage[4]);

                    }

                    if(itemQuantity > 12){
                        sc.close();
                        throw new OrderException (OrderMessages.arrayOfErrormessage[5]);
                    }

                    isItemFound = false;
                    for(int i = 0; i < itemNumArr.length; i++) {
                        if(itemNumArr[i] == itemNum) {
                            isItemFound = true;
                            totalAmount = itemPriceArr[i] * itemQuantity;
                            break;
                        }
                    }

                    if(!isItemFound) {
                        sc.close();
                        throw new OrderException (OrderMessages.arrayOfErrormessage[6]);
                    }

                    System.out.println("Total Amount due is: $" + totalAmount);
                }

                else {
                    sc.close();
                    throw new OrderException (OrderMessages.arrayOfErrormessage[1]);

                }

            }
            else {
                sc.close();
                throw new OrderException (OrderMessages.arrayOfErrormessage[0]);
                
            }
            
        }

        catch(OrderException exe) {
            System.out.println(exe.getMessage());
            
        }
        

    }
}
