package CHAPTER7;
 
import java.util.Scanner;
public class InputCharacterInfo {
    public static void main(String[] args) {
        
        Scanner SC = new Scanner(System.in);
        char aChar;
        

        System.out.print("Enter a aCharacter... ");
        aChar = SC.nextLine().charAt(0);
        SC.close();

    
        System.out.println("The character is " + aChar);

        if(Character.isUpperCase(aChar)){
            System.out.println(aChar + " is uppercase");
        }
        else{
            System.out.println(aChar + " is not uppercase");
        }
        if(Character.isLowerCase(aChar)){
            System.out.println(aChar + " is lowercase");
        }
        else{
            System.out.println(aChar + " is not lowercase");
        }

        aChar = Character.toLowerCase(aChar);
        System.out.println("After toLowerCase(), aChar is " + aChar);
        aChar = Character.toUpperCase(aChar);
        System.out.println("After toUpperCase(), aChar is " + aChar);

	    if(Character.isLetterOrDigit(aChar))
	       System.out.println(aChar+ " is a letter or digit");
	    else System.out.println(aChar+ " is neither a letter nor a digit");//checking digit
	    
	    if(Character.isWhitespace(aChar) || aChar == ' ')
	       System.out.println(aChar+" is whitespace");//checking whitespace
	    else 
	       System.out.println(aChar+" is not whitespace");
}
}

