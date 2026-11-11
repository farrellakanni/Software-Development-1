package week7;
import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = 0, second = 0, result = 0;

        System.out.print("Enter first number: ");
        first = input.nextInt();
        System.out.print("Enter second number: ");
        second = input.nextInt();
        result = first + second;
        System.out.println(first + " + " + second + " = " + result);
        result = first - second;
        System.out.println(first + " - " + second + " = " + result);
        result = first / second;
        System.out.println(first + " / " + second + " = " + result);
        result = first = second;
        System.out.println(first + " = " + second + " = " + result);
        result = first % second;
        System.out.println(first + " % " + second + " = " + result);


        System.out.println(first + " - " + second + " = " + (first - second));
        
        //6 + 4 * 4 - 4 / 4 = 6 + 16 - 1 = 21
        System.out.println(first + second * second - second / second);

        input.close();
    }
}
