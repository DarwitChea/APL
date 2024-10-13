import java.util.Scanner;
class NoRealRootsException extends Exception{
    public NoRealRootsException(String message){
        super(message);
    }
}

public class NoRealRootException {
    public static void findRoot(int a, int b, double delta) throws NoRealRootsException{
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("Equation has 2 solutions. x1 = 0.2%f , x2 = 0.2%f", x1,x2);
        }
        else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.printf("Equation has 1 solution. x1 = x2 = 0.2%f", x);
        }
        else {
            throw new NoRealRootsException("Delta must be equal or greater than 0.");
        }
    }

    public static void main(String[] args) {

        Scanner newscanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = newscanner.nextInt();
        System.out.print("Enter b: ");
        int b = newscanner.nextInt();
        System.out.print("Enter c: ");
        int c = newscanner.nextInt();
        double delta = Math.pow(b,2) - (4*a*c);
        System.out.println("delta: "+delta);
        System.out.println("Equation: " + a + "x2 + ("+ b +"x) + (" + c+")");
        try{
            findRoot(a,b,delta);
        }catch (NoRealRootsException e){
            System.out.println("Exception : " + e.getMessage());
        }
    }
}
