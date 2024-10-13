import java.util.Scanner;

public class SumAverageRunningInt {
    public static void main(String[] args)
    {
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("This is a program to sum number.");
        System.out.print("Enter the lower-bound: ");
        int lowerbound = scannerObject.nextInt();
        System.out.print("Enter the upper-bound: ");
        int upperbound = scannerObject.nextInt();

        int sum = 0;
        for (int i = lowerbound; i <= upperbound; i++)
        {
            sum = sum + i;
        }
        System.out.printf("The sum of %d to %d is %d",lowerbound,upperbound,sum);

        /* Calculate and Display Average */
        int avg = sum / upperbound;
        System.out.printf("\nThe average is %d",avg);
    }
}


