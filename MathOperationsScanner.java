
/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class MathOperationsScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("\n== Arithmetic Operators ==");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        if (b != 0) {
            System.out.println("Division: " + (a / b));
            System.out.println("Modulus: " + (a % b));
        } else {
            System.out.println("Division: Undefined (cannot divide by zero)");
            System.out.println("Modulus: Undefined (cannot divide by zero)");
        }
        System.out.println("\n== Assignment Operators ==");
        int x = a;
        System.out.println("x = " + x);
        x += b;
        System.out.println("x += b → " + x);
        x -= b;
        System.out.println("x -= b → " + x);
        x *= b;
        System.out.println("x *= b → " + x);
        if (b != 0) {
            x /= b;
            System.out.println("x /= b → " + x);
            x %= b;
            System.out.println("x %= b → " + x);
        } else {
            System.out.println("x /= b → Undefined (cannot divide by zero)");
            System.out.println("x %= b → Undefined (cannot divide by zero)");
        }

        System.out.println("\n== Increment & Decrement ==");
        int y = a;
        System.out.println("y = " + y);
        System.out.println("y++ = " + (y++));
        System.out.println("After y++ → " + y);
        System.out.println("++y = " + (++y));
        System.out.println("y-- = " + (y--));
        System.out.println("After y-- → " + y);
        System.out.println("--y = " + (--y));

        // --- Relational Operators ---
        System.out.println("\n== Relational Operators ==");
        System.out.println("a == b → " + (a == b));
        System.out.println("a != b → " + (a != b));
        System.out.println("a > b → " + (a > b));
        System.out.println("a < b → " + (a < b));
        System.out.println("a >= b → " + (a >= b));
        System.out.println("a <= b → " + (a <= b));

        // --- Logical Operators ---
        System.out.println("\n== Logical Operators ==");
        boolean p = (a > 0);
        boolean q = (b > 0);
        System.out.println("p (a>0) = " + p);
        System.out.println("q (b>0) = " + q);
        System.out.println("p && q → " + (p && q));
        System.out.println("p || q → " + (p || q));
        System.out.println("!p → " + (!p));

        sc.close();
    }
}

