package Week4;
import java.util.Scanner;

/**
 * Write a description of class GPAGrade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GPAGrade
{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the GPA:");
        float GPA=sc.nextFloat();
        if(GPA>4 && GPA<0){ System.out.println("Invalid GPA");}
        else if (GPA<=4 && GPA>=3.6){System.out.println(" The grade obtained is A+");
        } else if (GPA<3.6 && GPA>=3.2){System.out.println("The grade obtained is A");
        }else if (GPA<3.2 && GPA>=2.8){System.out.println("The grade obtained is B+");}
        else if (GPA<2.8 && GPA>=2.4){System.out.println("the grade obtained is B");}
        else if (GPA<2.4 && GPA>=2){System.out.println("The grade obtained is C+");}
        else if (GPA<2 &&  GPA>=1.6){System.out.println("The grade obtained is C");}
        else if (GPA<1.6){ System.out.println("Not Graded");}
    }
}