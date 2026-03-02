import java.util.Scanner;
public class TimePrintTen {
    public static void main(String[] args) {
        long IterStart = System.nanoTime();
        iterative();
        long IterEnd = System.nanoTime();
        System.out.println("Iterative Time: " + (IterEnd - IterStart) + " ns");
        long RecurStart = System.nanoTime();
        recursive(1);
        long RecurEnd = System.nanoTime();
        System.out.println("Recursive Time: " + (RecurEnd - RecurStart) + " ns");
        long TimeDiff = Math.abs((IterEnd - IterStart) - (RecurEnd - RecurStart));
        System.out.println("TimeDiff: " + TimeDiff + " ns");
    }
    public static void iterative() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void recursive(int n) {
        if (n > 10) {
            System.out.println();
            return;
        }
        System.out.print(n + " ");
        recursive(n + 1);
    }
}
