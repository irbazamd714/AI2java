package Week4;
import java.util.Scanner;


/**
 * Write a description of class EvenOddExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EvenOddExample{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        if(number%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        System.out.println("Ok job finished");
        
    }
}
        // initialise instance variables
 