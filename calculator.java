import java.util.Scanner;

public class calculator {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Taking Input form the user
        
        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Enter the operator(+,-,*,/,%): ");
        char op = sc.next().charAt(0);


        // Giving result by using switch case

        switch (op) {

            case '+': System.out.println(num1 + num2);
                break;

            case '-': System.out.println(num1 - num2);
                break;

            case '*': System.out.println(num1 * num2);
                break;

            case '/': System.out.println(num1 / num2);
                break;

            case '%': System.out.println(num1 % num2);
                break;

            default: System.out.println("Invalid Operator.");

        }
    }
   
}
