import java.util.Scanner;

public class Quadratic_Equation {
    public static void main(String[] args)
    {
        /* User Input */
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        double a = scannerObject.nextDouble();

        System.out.println("Enter the value of b: ");
        double b = scannerObject.nextDouble();

        System.out.println("Enter the value of c: ");
        double c = scannerObject.nextDouble();

        if(b<0 && c>0)
        {
            System.out.printf("Your equation: %.0fx^2 %.0fx + %.0f \n ",a,b,c);
        }
        else if(b>0 && c<0)
        {
                System.out.printf("Your equation: %.0fx^2 + %.0fx %.0f \n",a,b,c);
        }
        else if(b<0 && c<0)
        {
                System.out.printf("Your equation: %.0fx^2 %.0fx %.0f \n", a, b, c);
        }
        else
        {
            System.out.printf("Your equation: %.0fx^2 + %.0fx + %.0f \n", a, b, c);
        }

        /* Calculate Determinant */
        double d = b*b - 4*a*c;
        System.out.printf("Determinant: %.0f \n",d);

        /* Calculate Roots */
        if(d>0)
        {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("The roots of this equation are: \n x1 = " + r1 + "\n x2 = " + r2);

        }
        else if(d == 0)
        {
            /* r1 = r2 */
            double r = - b / (2 * a);
            System.out.printf("x1 = x2 = %.2f",r);
        }
        else
        {
            double real = (-b /(2 * a));
            double imaginary = (Math.sqrt(-d)) / (2 * a);

            System.out.println("The roots of this equation are: ");
            System.out.printf("x1 = %.2f + i%.2f",real,imaginary);
            System.out.printf("x1 = %.2f - i%.2f",real,imaginary);
        }
    }
}