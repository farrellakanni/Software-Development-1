package week6;
import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        char letter;

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

        //part 4. 
        System.out.print("Enter a letter: ");
        letter = input.next().charAt(0);
        System.out.println(letter + " found in " + word + ": " + word.indexOf(letter));

        //part 5.
        String fn, sn;
        System.out.print("Enter your first name: ");
        fn = input.next();
        System.out.print("Enter your surname: ");
        sn = input.next();
        System.out.println("Full name: " + fn.concat(" ").concat(sn));
        System.out.println("Full name: " + fn + " " + sn);

        //part 6.
        String str1, str2;
        System.out.println("Enter a string: ");
        str1 = input.next();
        System.out.println("Enter another string: ");
        str2 = input.next();
        System.out.println(str1 + " matches " + str2 + ": " + str1.equals(str2));
        System.out.println(str1 + " matches " + str2 + ": " + str1.equalsIgnoreCase(str2));
        
        //part 7.
        System.out.println("First 3 characters of " + word + " is " + word. substring(0, 3));

        //part 8.
        System.out.println(word + " replace u values with x values: " + word.replace('u', 'x'));


        input.close();
    }
}
