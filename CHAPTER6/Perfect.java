package CHAPTER6;

public class Perfect {
    public static void main (String args[]) {
        for(int i = 0 ; i <= 1000 ; i++){
            if(perfect(i)){
                System.out.println(i + " is a perfect number");
            }
        }
    }
    public static boolean perfect(int n) {
        
        int sum = 1,i;
        for(i = 2 ; i < n ; i++){
            if (n % i == 0) 
                sum = sum + i;
                }
                if (sum == n)
                    return true;
                else
                    return false;
    }
        
}
    
