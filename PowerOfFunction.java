import java.util.Scanner;

public class PowerOfFunction {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the base number: ");
        double base = sc.nextDouble();
        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();
        double result = 1.0;
        for (int i = 0; i < exponent; i++) 
        {
            result *= base;
        }
        System.out.println("Result: " + result);
        sc.close();
    }
}
