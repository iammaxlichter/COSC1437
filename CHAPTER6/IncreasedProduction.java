package CHAPTER6;

public class IncreasedProduction {
    public static void main(String[] args) {

        double amount=4000;

        for(int i=1;i<=24;i++){
            System.out.printf("Month : " + i + " : Production : " + amount);

            if(amount>=7000){
                System.out.println("\nThe month in which production exceeds 7000.0 is month "+i);
                }

        amount=amount*1.06; // increasing the production by 6%
        }
    }
}