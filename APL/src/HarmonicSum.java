import java.util.Scanner;

public class HarmonicSum {
    public static void main(String[] args)
    {
        Scanner scannerObject = new Scanner(System.in);
        System.out.print("Enter the number of time you want to sum up : ");
        int n = scannerObject.nextInt();

        double sumLeft2Right = 0;
        double sumRight2Left = 0;

        for (int i = 1; i <= n; i++)
        {
            sumLeft2Right = (sumLeft2Right + 1.0 / i);
        }

        for (int i = n; i >= 1; i--)
        {
            sumRight2Left = (sumRight2Left + 1.0 / i);
        }

        System.out.printf("\nSum of Harmonic Series from Left is %.20f",sumLeft2Right);
        System.out.printf("\nSum of Harmonic Series from Right is %.20f",sumRight2Left);


        /* Find Absolute Difference*/

        double absDiff = Math.abs(sumLeft2Right - sumRight2Left);
        System.out.printf("\nThe absolute difference between these 2 number is %.20f",absDiff);

        /* Reason */
        System.out.println("\nIn the right to left sum you're adding from smallest to largest, and the least significant remnants have a change to accumulate, unlike in the left to right sum \nwhere a longer part of the mantissa needs to be dropped for the smallest added numbers.");
    }
}

