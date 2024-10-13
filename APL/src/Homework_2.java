import java.util.Scanner;

public class Homework_2 {
    public static void main(String[] args) {
        int circle, rectangle, triangle, ellipse, parallelogram, Operator;
        double π = 3.14;
        Scanner ScannerObject = new Scanner(System.in);

        System.out.println("\nProgram to solve Geometry!\n");
        System.out.println("1.Circle");
        System.out.println("2.Rectangle");
        System.out.println("3.Triangle");
        System.out.println("4.Ellipse");
        System.out.println("5.Parallelogram\n");
        System.out.printf("Choose type of Geometry that u want to solve: ");
        Operator = ScannerObject.nextInt();

        switch (Operator) {
            case 1: {
                System.out.println("\nYou choose Circle!");
                System.out.println("What do u want to find?\n");
                System.out.println("1.Area");
                System.out.println("2.Parameter\n");
                System.out.printf("Choose type of problem that u want to solve: ");

                int operator;
                operator = ScannerObject.nextInt();

                if (operator == 1) {
                    System.out.println("\nArea of circle: A = πr²");
                    System.out.printf("Input value of r = ");
                    double r = ScannerObject.nextDouble();
                    double A = π * (r * r);
                    System.out.printf("\nArea of circle: A = %.2f\n", A);

                } else {
                    System.out.println("\nParameter of circle: C = 2πr");
                    System.out.printf("Input value of r = ");
                    double r = ScannerObject.nextDouble();
                    double C = 2 * π * r;
                    System.out.printf("\nParameter of circle: C = %.2f\n", C);
                }
                break;
            }
            case 2: {
                System.out.println("\nYou choose Rectangle!");
                System.out.println("What do u want to find?\n");
                System.out.println("1.Area");
                System.out.println("2.Parameter\n");
                System.out.printf("Choose type of problem that u want to solve: ");

                int operator;
                operator = ScannerObject.nextInt();

                if (operator == 1) {
                    System.out.println("\nArea of Rectangle: A = wl");
                    System.out.printf("Input value of w = ");
                    double w = ScannerObject.nextDouble();
                    System.out.printf("Input value of l = ");
                    double l = ScannerObject.nextDouble();
                    double A = w * l;
                    System.out.printf("\nArea of Rectangle: A = %.2f\n", A);

                } else {
                    System.out.println("\nParameter of Rectangle: P = 2(w+l)\n");
                    System.out.printf("Input value of w = ");
                    double w = ScannerObject.nextDouble();
                    System.out.printf("Input value of l = ");
                    double l = ScannerObject.nextDouble();
                    double P = 2 * (w + l);
                    System.out.printf("\nParameter of Rectangle: P = %.2f\n", P);
                }
                break;
            }
            case 3: {
                System.out.println("\nYou choose Triangle!");
                System.out.println("What do u want to find?\n");
                System.out.println("1.Area");
                System.out.println("2.Parameter\n");
                System.out.printf("Choose type of problem that u want to solve: ");

                int operator;
                operator = ScannerObject.nextInt();

                if (operator == 1) {
                    System.out.println("\nArea of Triangle: A = (h*b)/2");
                    System.out.printf("Input value of h = ");
                    double h = ScannerObject.nextDouble();
                    System.out.printf("Input value of b = ");
                    double b = ScannerObject.nextDouble();
                    double A = (h * b) / 2;
                    System.out.printf("\nArea of Triangle: A = %.2f\n", A);

                } else {
                    System.out.println("\nParameter of Triangle: P = a+b+c\n");
                    System.out.printf("Input value of a = ");
                    double a = ScannerObject.nextDouble();
                    System.out.printf("Input value of b = ");
                    double b = ScannerObject.nextDouble();
                    System.out.printf("Input value of c = ");
                    double c = ScannerObject.nextDouble();
                    double P = a + b + c;
                    System.out.printf("\nParameter of Triangle: P = %.2f\n", P);
                }
                break;
            }
            case 4: {
                System.out.println("\nYou choose Ellipse!");
                System.out.println("What do u want to find?\n");
                System.out.println("1.Area");
                System.out.println("2.Parameter\n");
                System.out.printf("Choose type of problem that u want to solve: ");

                int operator;
                operator = ScannerObject.nextInt();

                if (operator == 1) {
                    System.out.println("\nArea of Ellipse: A = πab");
                    System.out.printf("Input value of a = ");
                    double a = ScannerObject.nextDouble();
                    System.out.printf("Input value of b = ");
                    double b = ScannerObject.nextDouble();
                    double A = π * a * b;
                    System.out.printf("\nArea of Ellipse: A = %.2f\n", A);

                } else {
                    System.out.println("\nParameter of Ellipse: C = π(a+b)\n");
                    System.out.printf("Input value of a = ");
                    double a = ScannerObject.nextDouble();
                    System.out.printf("Input value of b = ");
                    double b = ScannerObject.nextDouble();
                    double C = π * (a + b);
                    System.out.printf("\nParameter of Ellipse: C = %.2f\n", C);
                }
                break;
            }
            case 5: {
                System.out.println("\nYou choose Parallelogram!");
                System.out.println("What do u want to find?\n");
                System.out.println("1.Area");
                System.out.println("2.Parameter\n");
                System.out.printf("Choose type of problem that u want to solve: ");

                int operator;
                operator = ScannerObject.nextInt();

                if (operator == 1) {
                    System.out.println("\nArea of Parallelogram: A = bh");
                    System.out.printf("Input value of b = ");
                    double b = ScannerObject.nextDouble();
                    System.out.printf("Input value of h = ");
                    double h = ScannerObject.nextDouble();
                    double A = b * h;
                    System.out.printf("\nArea of Parallelogram: A = %.2f\n", A);

                } else {
                    System.out.println("\nParameter of Parallelogram: P = 2(a+b)\n");
                    System.out.printf("Input value of a = ");
                    double a = ScannerObject.nextDouble();
                    System.out.printf("Input value of b = ");
                    double b = ScannerObject.nextDouble();
                    double P = 2 * (a + b);
                    System.out.printf("\nParameter of Parallelogram: P = %.2f\n", P);
                }
                break;
            }
        }
    }
}