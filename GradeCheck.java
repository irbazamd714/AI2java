
/**
 * Write a description of class GradeCheck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        int grade = sc.nextInt();

        // Using ternary operator
        String result = (grade >= 40) ? "Pass" : "Fail";

        System.out.println("Result: " + result);

        sc.close();
    }
}
