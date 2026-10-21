package week6;
import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;

        System.out.print("Enter a word: ");
        word = input.next();
        System.out.println(word + " contains " + word.length() + " characters.");
        
        System.out.println("First character is " + word.charAt(0) + " and last character is " + 
                                word.charAt(word.length() - 1));
        
        char second = word.charAt(1);
        System.out.println(" Second character: " + second);
        int index = word.indexOf(second);
        System.out.println("In " + word + " second character is " + second);
        System.out.println("It is found at index: " + word.charAt(index));
       
        input.close();
    }
}