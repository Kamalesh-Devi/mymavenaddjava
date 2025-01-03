package jar;

/**
 * Hello world!
 */
import java.util.Scanner;


/**
 * Hello world!
 */
public class AppCalc {
    
    public static void main(String[] args) {
        int x, y, sum;
        try (Scanner myObj = new Scanner(System.in) // Create a Scanner object
        ) {
            System.out.println("Type a number:");
            x = myObj.nextInt(); // Read user input
            
            System.out.println("Type another number:");
            y = myObj.nextInt(); // Read user input
            sum = add(x,y); 
        }
    //sum = x + y;
    System.out.println("Sum is: " + sum); 

    }
    public static int add(int number1, int number2) {
        return number1 + number2;
    }
}