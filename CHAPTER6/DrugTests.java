package CHAPTER6;

public class DrugTests {
    public static void main(String[] args) {
        
        for (int i = 1; i<= 52; i++){
            int testedEmployee = 1 + (int) (Math.random() * 30);
            System.out.print("week " + i + " Emp # " + testedEmployee );
            System.out.print("\t");
            if (i % 3 == 0){
                System.out.println();
            }
        }
    }
}