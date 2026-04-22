import java.util.Scanner;

public class RecursiveFact {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n = scanner.nextInt();  
        
        try {
            long result = RecursiveFactorial(n);
            System.out.println("The factorial of "+n+" is "+result);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        scanner.close();
    }

    public static long RecursiveFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Input must be between 0 and 20.");
        }
        
        if (n <= 1) {
            return 1;
        }
        
        return n * RecursiveFactorial(n - 1);
    }
}