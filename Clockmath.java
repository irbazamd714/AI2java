
/**
 * Write a description of class Clockmath here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Clockmath{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the seconds:");
        float s=input.nextFloat();
        System.out.println("Hour is:"+(s/3600));
        System.out.println("Total MInutes is :"+(s/60));
        input.close();
    }
}