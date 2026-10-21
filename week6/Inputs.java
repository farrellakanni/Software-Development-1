package week6;
import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int number;
        float dec;

        System.out.print("Enter a whole number: ");
        number = input.nextInt();
        System.out.print("Enter a decimal number: ");
        dec = input.nextFloat(); 
        System.out.print("Enter a name: ");
        name = input.next();

        System.out.println( name + ", you entered the numbers " + number + " and " + dec + ".");




        input.close();
    }
}