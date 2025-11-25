package Week4;
import java.util.Scanner;

/**
 * Write a description of class CalculatorUsingSwitch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalculatorUsingSwitch
{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=input.nextInt();
        System.out.println("Enter the second number");
        int num2=input.nextInt();
        System.out.println("Enter the operator as + - * /");
        char operator=input.next().charAt(0);
        switch(operator)
        {
            case '+': System.out.println("Addition is "+(num1+num2));
                break;
            case '-': System.out.println("Subtraction"+(num1-num2));
                break;
            case '*': System.out.println("Multiplication is"+(num1*num2));
                break;
                case'/': System.out.println("Division is"+(num1/num2));
                break;
        }
    }

}