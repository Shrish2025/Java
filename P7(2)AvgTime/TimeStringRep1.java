import java.util.Scanner;

public class TimeStringRep1{
    record SearchResult(int count, long durationNano) {}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Source String (s1): ");
        String s1 = sc.nextLine();
        System.out.print("Enter Target String (s2): ");
        String s2 = sc.nextLine();
        System.out.println("\n");
        SearchResult iter = runIterative(s1, s2);
        System.out.printf("Iterative Result: %d | Time: %d ns%n", iter.count(), iter.durationNano());
        SearchResult recur = runRecursive(s1, s2);
        System.out.printf("Recursive Result: %d | Time: %d ns%n", recur.count(), recur.durationNano());
        long diff = Math.abs(iter.durationNano() - recur.durationNano());
        String faster = iter.durationNano() < recur.durationNano() ? "Iterative" : "Recursive";
        System.out.println("\nPerformance Gap: " + diff + " ns (" + faster + " was faster)");
        sc.close();
    }
    public static SearchResult runIterative(String s1, String s2) {
        long start = System.nanoTime();    
        int count = 0;
        int l1 = s1.length();
        int l2 = s2.length();
        if (l2 != 0 && l1 >= l2) {
            for (int i = 0; i <= l1 - l2; i++) {
                boolean match = true;
                for (int j = 0; j < l2; j++) {
                    if (s1.charAt(i + j) != s2.charAt(j)) {
                        match = false;
                        break;
                    }
                }
                if (match) count++;
            }
        }
        long end = System.nanoTime();
        return new SearchResult(count, end - start);
    }

    public static SearchResult runRecursive(String s1, String s2) {
        long start = System.nanoTime();
        
        int count = 0;
        if (s1 != null && s2 != null && !s2.isEmpty()) {
            count = performRecursion(s1, s2, 0);
        }

        long end = System.nanoTime();
        return new SearchResult(count, end - start);
    }
    private static int performRecursion(String s1, String s2, int i) {
        if (i > s1.length() - s2.length()) return 0;
        boolean isMatch = true;
        for (int j = 0; j < s2.length(); j++) {
            if (s1.charAt(i + j) != s2.charAt(j)) {
                isMatch = false;
                break;
            }
        }
        return (isMatch ? 1 : 0) + performRecursion(s1, s2, i + 1);
    }
}
