import java.util.Scanner;

public class Find_Perimeter_Area {
    public static void main(String[] args)
    {
        int circle, rectangle, triangle, ellipse, parallelogram, Operator;
        double pi = 3.14;
        Scanner ScannerObject = new Scanner(System.in);

        System.out.println("Program to find Perimeter and Area of Geometry!\n");
        System.out.println("1.Circle");
        System.out.println("2.Rectangle");
        System.out.println("3.Triangle");
        System.out.println("4.Ellipse");
        System.out.println("5.Parallelogram\n");
        System.out.println("Pick a shape you want to solve: ");

        Operator = ScannerObject.nextInt();

        switch (Operator) {
            case 1: {
                System.out.println("You picked Circle.");
                System.out.println("What do u want to find?");
                System.out.println("1.Perimeter");
                System.out.println("2.Area\n");
                System.out.println("Choose what you want to solve: ");

                int choice = ScannerObject.nextInt();

                if (choice == 1) {
                    System.out.println("Perimeter of circle: C = 2πr");
                    System.out.println("Input value of the Radius (r) = ");
                    double r = ScannerObject.nextDouble();
                    double C = 2 * pi * r;
                    System.out.printf("Perimeter of the circle: C = %.2f\n", C);
                } else {
                    System.out.println("Area of circle: A = πr²");
                    System.out.println("Input value of the Radius (r)= ");
                    double r = ScannerObject.nextDouble();
                    double A = pi * (r * r);
                    System.out.printf("\nArea of circle: A = %.2f", A);
                }
                break;
            }
            case 2: {
                System.out.println("You picked Rectangle.");
                System.out.println("What do u want to find?");
                System.out.println("1.Perimeter");
                System.out.println("2.Area\n");
                System.out.println("Choose what you want to solve: ");

                int choice = ScannerObject.nextInt();

                if (choice == 1) {
                    System.out.println("Perimeter of Rectangle: P = 2(w+l)");
                    System.out.println("Input value of the Width (w) = ");
                    double w = ScannerObject.nextDouble();
                    System.out.println("Input value of the Length (l) = ");
                    double l = ScannerObject.nextDouble();
                    double P = 2 * (w + l);
                    System.out.printf("\nPerimeter of Rectangle: P = %.2f", P);
                } else {
                    System.out.println("Area of Rectangle: A = wl");
                    System.out.println("Input value of the Width (w) = ");
                    double w = ScannerObject.nextDouble();
                    System.out.println("Input value of the Length (l) = ");
                    double l = ScannerObject.nextDouble();
                    double A = w * l;
                    System.out.printf("\nArea of Rectangle: A = %.2f", A);
                }
                break;
            }
            case 3: {
                System.out.println("You picked Triangle.");
                System.out.println("What do u want to find?");
                System.out.println("1.Perimeter");
                System.out.println("2.Area\n");
                System.out.println("Choose what you want to solve: ");

                int choice = ScannerObject.nextInt();

                if (choice == 1) {
                    System.out.println("\nPerimeter of Triangle: P = a+b+c");
                    System.out.println("Input value of a side = ");
                    double a = ScannerObject.nextDouble();
                    System.out.println("Input value of b side = ");
                    double b = ScannerObject.nextDouble();
                    System.out.println("Input value of c side = ");
                    double c = ScannerObject.nextDouble();
                    double P = a + b + c;
                    System.out.printf("\nParameter of Triangle: P = %.2f", P);
                } else {
                    System.out.println("\nArea of Triangle: A = (h*b)/2");
                    System.out.println("Input value of the height (h) = ");
                    double h = ScannerObject.nextDouble();
                    System.out.println("Input value of the base (b) = ");
                    double b = ScannerObject.nextDouble();
                    double A = (h * b) / 2;
                    System.out.printf("\nArea of Triangle: A = %.2f", A);
                }
                break;
            }
            case 4: {
                System.out.println("You picked Ellipse.");
                System.out.println("What do u want to find?");
                System.out.println("1.Perimeter");
                System.out.println("2.Area\n");
                System.out.println("Choose what you want to solve: ");

                int choice = ScannerObject.nextInt();

                if (choice == 1) {
                    System.out.println("\nPerimeter of Ellipse: C = π(a+b)");
                    System.out.println("Input value of Major Axis (a) = ");
                    double a = ScannerObject.nextDouble();
                    System.out.println("Input value of Minor Axis (b) = ");
                    double b = ScannerObject.nextDouble();
                    double C = pi * (a + b);
                    System.out.printf("\nParameter of Ellipse: C = %.2f", C);
                } else {
                    System.out.println("\nArea of Ellipse: A = πab");
                    System.out.println("Input value of Major Axis (a) = ");
                    double a = ScannerObject.nextDouble();
                    System.out.println("Input value of Minor Axis (b) = ");
                    double b = ScannerObject.nextDouble();
                    double A = pi * a * b;
                    System.out.printf("\nArea of Ellipse: A = %.2f", A);
                }
                break;
            }
            case 5: {
                System.out.println("You picked Parallelogram.");
                System.out.println("What do u want to find?");
                System.out.println("1.Perimeter");
                System.out.println("2.Area\n");
                System.out.println("Choose what you want to solve: ");

                int choice = ScannerObject.nextInt();

                if (choice == 1) {
                    System.out.println("\nParameter of Parallelogram: P = 2(a+b)");
                    System.out.println("Input value of a side = ");
                    double a = ScannerObject.nextDouble();
                    System.out.println("Input value of b side = ");
                    double b = ScannerObject.nextDouble();
                    double P = 2 * (a + b);
                    System.out.printf("\nParameter of Parallelogram: P = %.2f", P);
                } else {
                    System.out.println("\nArea of Parallelogram: A = bh");
                    System.out.println("Input value of base (b) = ");
                    double b = ScannerObject.nextDouble();
                    System.out.println("Input value of height (h)= ");
                    double h = ScannerObject.nextDouble();
                    double A = b * h;
                    System.out.printf("\nArea of Parallelogram: A = %.2f", A);
                }
                break;
            }
        }
    }
}
