package CHAPTER8;

public class ArrayMethodDemo {
    public static void main (String args[]) {
        int[] numbers = {12, 15, 34, 67, 4, 9, 10, 7};
        int limit = 12;

        display(numbers);
        System.out.println();
        displayReverse(numbers);
        System.out.println();
        displaySum(numbers);
        System.out.println();
        displayLessThan(numbers, limit);
        System.out.println();
        displayHigherThanAverage(numbers);
    }
    public static void display(int[] numbers) {
        for(int i = 0; i<numbers.length ; i++){
            System.out.print(numbers[i] + " ");
        }
    }
    public static void displayReverse(int[] numbers) {
        for(int i = 7; i>=0 ; i--){
            System.out.print(numbers[i] + " ");
        }
    }
    public static void displaySum(int[] numbers) {
        int total = 0;
        for(int i = 0; i<numbers.length ; i++){
            total += numbers[i];
        }
        System.out.print(total);
    }
    public static void displayLessThan(int[] numbers, int limit) {
        for(int i = 0; i<numbers.length ; i++){
            if (numbers[i] >= limit){
                System.out.print("");
            }
            else{
                System.out.print(numbers[i] + " ");
            }
            
        }

    }
    public static void displayHigherThanAverage(int[] numbers) {
        int total = 0, count = 0;
        for(int i = 0; i<numbers.length ; i++){
            total += numbers[i];
            count += 1;
        }
        int average = total/count;
        for(int i = 0; i<numbers.length ; i++){
            if (numbers[i] <= average){
                System.out.print("");
            }
            else{
                System.out.print(numbers[i] + " ");
            }
        }
    }
}

