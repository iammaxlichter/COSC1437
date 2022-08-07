package CHAPTER7;


public class CountSpaces
{
    public static void main(String[] args)
    {
        String Quote = "Hello what is going on here my bad";
        int Count = calculateSpaces(Quote);

        System.out.println("The number of white spaces is " + Count);
    }
    public static int calculateSpaces(String inString){

        int count = 0;

        for(int i = 0; i < inString.length(); i++){
            if(inString.charAt(i) == ' ') {
                count++;
            }
        }

        return count;
    }
}
