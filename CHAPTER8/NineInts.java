package CHAPTER8;

public class NineInts {
    public static void main (String args[]) {
        
        int numbers[] = new int[]{10, 15, 19, 23, 26, 29, 31, 34, 38};

        for (int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        for (int i = 8; i>=0; i--){
            System.out.print(numbers[i] + " ");
        }
        
    }
}
