package CHAPTER6;

public class DiagonalOs {
    public static void main(String[] args) {
        for(int i = 0 ; i < 11 ; i++){
            for (int n = 0 ; n < 11 ; n++){

            if(i == n){
                System.out.print("O");
                }

            else {
                System.out.print(" ");
                }
            }
                
            if( i != 10 )
                System.out.println();
                
                }
        }
}
