package CHAPTER7;

import java.util.*;
public class Palindrome
{
    public static void main(String[] args) {

        Scanner SC=new Scanner(System.in);
        
        String Sentence,str;
        int len,i;
        str="";

        System.out.print("\n\nEnter a string: ");
        Sentence=SC.nextLine();
        System.out.println(Sentence);

        SC.close();

        Sentence = Sentence.replaceAll("\\W","");
        len = Sentence.length();

        for(i=len-1;i>=0;i--){
            str=str+Sentence.charAt(i);
        }

        if(Sentence.equalsIgnoreCase(str)){
            System.out.println("You entered a palindrome.");
        }

        else{
            System.out.println("You did not enter a palindrome.");
        }

        System.out.println("\n");
    }
}