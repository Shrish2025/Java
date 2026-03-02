import java.util.Scanner;

public class TimeStringRep2 {
    record BenchResult(int count, long durationNano) {}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter String 2: ");
        String s2 = sc.nextLine();
        System.out.println("\n");
        BenchResult iter = runIterative(s1, s2);
        System.out.printf("Iterative Result: %d | Time: %d ns%n", iter.count(), iter.durationNano());
        BenchResult recur = runRecursive(s1, s2);
        System.out.printf("Recursive Result: %d | Time: %d ns%n", recur.count(), recur.durationNano());
        long diff = Math.abs(iter.durationNano() - recur.durationNano());
        System.out.println("\nTime taken " + diff + " ns");
        
        sc.close();
    }

    public static BenchResult runIterative(String s1, String s2) {
        if (s1 == null || s2 == null || s2.isEmpty() || s1.length() < s2.length()) {
            return new BenchResult(0, 0);
        }

        long start = System.nanoTime();
        
        int count = 0;
        int l1 = s1.length();
        int l2 = s2.length();

        for (int i = 0; i <= l1 - l2; i++) {
            // Memory Catch: .substring() creates a new object on every iteration!
            if (s1.substring(i, i + l2).equals(s2)) {
                count++;
            }
        }

        long end = System.nanoTime();
        return new BenchResult(count, end - start);
    }

    public static BenchResult runRecursive(String s1, String s2) {
        if (s1 == null || s2 == null || s2.isEmpty() || s1.length() < s2.length()) {
            return new BenchResult(0, 0);
        }

        long start = System.nanoTime();
        
        int count = performRecursion(s1, s2, 0);
        
        long end = System.nanoTime();
        return new BenchResult(count, end - start);
    }

    private static int performRecursion(String s1, String s2, int i) {
        if (i > s1.length() - s2.length()) return 0;

        int matched = s1.substring(i, i + s2.length()).equals(s2) ? 1 : 0;
        return matched + performRecursion(s1, s2, i + 1);
    }
}
