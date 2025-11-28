package Week4;
import java.util.Scanner;

/**
 * Write a description of class Scholarship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scholarship
{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the gpa");
        float gpa=sc.nextFloat();
        System.out.println("Enter the attendance percentage");
        double attendance=sc.nextDouble();
        System.out.println("Enter the attitude Score(1-10)");
        int attitude=sc.nextInt();
        if(gpa>=3.2 && attendance>80 && attitude<5){
            System.out.println("The student is eligible for Scholarship");
        }else {System.out.println("The student is not eligible for scholarship");}

    }
}