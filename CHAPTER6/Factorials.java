package CHAPTER6;

public class Factorials{

    public static void main(String []args) {

    int numb;

    for(int i=1 ; i<=10 ; i++) {
        numb = fact(i);
        System.out.println("the factorial of " + i + " is " + numb);
        }

    }
    
    static int fact(int num) {
        int product=1; 
        for(int i=1;i<=num;i++)
        product = product*i; 
        return product;
    }
}
