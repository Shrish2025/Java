import java.util.Scanner;

public class IterativeFact {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	int n;
	System.out.print("Enter the number: ");
	n = scanner.nextInt();  
        
        try {
            long result = IterativeFactorial(n);
            System.out.println("The facttorial of "+n+" is "+result);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
		//Error stream command
        }
        scanner.close();
    }

    public static long IterativeFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Input must be between 0 and 20.");
        } //Factorial of 20 exceeds long type bounds

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}