import java.util.Scanner;

public class TimeFactorial {

    // Simple wrapper to return two values
    static class Result {
        long value;
        long durationNano;

        Result(long value, long durationNano) {
            this.value = value;
            this.durationNano = durationNano;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number (0-20): ");
        
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input.");
            return;
        }
        
        int n = scanner.nextInt();

        try {
            // Iterative Execution
            Result iter = iterativeFactorial(n);
            System.out.println("--- Iterative ---");
            System.out.println("Result: " + iter.value);
            System.out.println("Time Taken: " + iter.durationNano + " ns");

            // Recursive Execution
            Result recur = recursiveFactorial(n);
            System.out.println("\n--- Recursive ---");
            System.out.println("Result: " + recur.value);
            System.out.println("Time Taken: " + recur.durationNano + " ns");

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static Result iterativeFactorial(int n) {
        validate(n);
        long startTime = System.nanoTime();
        
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        
        long endTime = System.nanoTime();
        return new Result(result, endTime - startTime);
    }

    public static Result recursiveFactorial(int n) {
        validate(n);
        long startTime = System.nanoTime();
        
        long factResult = calculateRecursive(n);
        
        long endTime = System.nanoTime();
        return new Result(factResult, endTime - startTime);
    }

    // Helper to keep timing accurate by not timing the validation or overhead
    private static long calculateRecursive(int n) {
        if (n <= 1) return 1;
        return n * calculateRecursive(n - 1);
    }

    private static void validate(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Input must be between 0 and 20.");
        }
    }
}
