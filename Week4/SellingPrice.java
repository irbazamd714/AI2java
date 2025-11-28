package Week4;
import java.util.Scanner;

/**
 * Write a description of class SellingPrice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SellingPrice
{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the mp of an item");
        int mp=sc.nextInt();
        System.out.println("Enter the category of the item (A/B/C/D):");
        char category=sc.next().charAt(0);
        switch (category){
                case'A':{
                    int d=60;
                    float sp;
                    sp=(mp-(mp*d/100));
                    System.out.println("your price is:"+sp);

                } break;
                case'B':{
                    int d=40;
                    float sp;
                    sp=(mp-(mp*d/100));
                    System.out.println("your price is:"+sp);

                }break;
                case'c':{
                    int d=20;
                    float sp;
                    sp=(mp-(mp*d/100));
                    System.out.println("your price is:"+sp);
                }break;
            case 'd':{
                    int d=10;
                    float sp;
                    sp=(mp-(mp*d/100));
                    System.out.println("your price is:"+sp);
                }break;
        }
    }

}