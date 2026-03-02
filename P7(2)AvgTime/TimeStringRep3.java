import java.util.Scanner;
public class TimeStringRep3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter String 2: ");
        String s2 = sc.nextLine();
        long IterStart = System.nanoTime();
        int iterativeResult = iterative(s1, s2);
        long IterEnd = System.nanoTime();
        System.out.print("Iterative Result 3: ");
        System.out.println((IterEnd - IterStart) + " ns");
        long RecurStart = System.nanoTime();
        int recursiveResult = recursive(s1, s2);
        long RecurEnd = System.nanoTime();
        System.out.print("Recursive Result 3: ");
        System.out.println((RecurEnd - RecurStart) + " ns");
        long TimeDiff = Math.abs((IterEnd - IterStart) - (RecurEnd - RecurStart));
        System.out.println("TimeDiff: " + TimeDiff + " ns");
        sc.close();
    }
    public static int iterative(String s1, String s2) {
        if (s1 == null || s2 == null || s2.isEmpty() || s1.length() < s2.length()) return 0;
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        int count = 0;
        for (int i = 0; i <= a1.length - a2.length; i++) {
            char[] d1 = s1.toCharArray();
            boolean possible = true;
            for (int j = 0; j < a2.length; j++) {
                d1[i + j] = a2[j];
                if (d1[i + j] != a1[i + j]) {
                    possible = false;
                    break;
                }
            }
            if (possible) count++;
        }
        return count;
    }
    public static int recursive(String s1, String s2) {
        if (s1 == null || s2 == null || s2.isEmpty() || s1.length() < s2.length()) return 0;
        class Resolver {
            int recur(char[] a1, char[] a2, int i) {
                if (i > a1.length - a2.length) return 0;
                char[] d1 = s1.toCharArray();
                boolean match = true;
                for (int j = 0; j < a2.length; j++) {
                    d1[i + j] = a2[j];
                    if (d1[i + j] != a1[i + j]) {
                        match = false;
                        break;
                    }
                }
                return (match ? 1 : 0) + recur(a1, a2, i + 1);
            }
        }
        return new Resolver().recur(s1.toCharArray(), s2.toCharArray(), 0);
    }
}
