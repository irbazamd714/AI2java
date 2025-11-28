package Week4;
import java.util.Scanner;

/**
 * Write a description of class NumberSign here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumberSign
{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("The number is positive");

        }else if(num==0){
            System.out.println("the number is zero");
        }else if (num<0){
            System.out.println("The number is negative");
        }

    }
}

