import java.util.Scanner;

class Ise2StarPatternRecur {
    static int n, mid, maxLength;

    static void printFirstHalf(int i) {
        int nStar = 4 * i + 1;
        int nSpaces = (maxLength - nStar) / 2;
        System.out.println(" ".repeat(nSpaces) + "*".repeat(nStar));
        
        int next = i + 1;
        if (next < mid) {
            printFirstHalf(next);
        } else {
            printSecondHalf(next);
        }
    }

    static void printSecondHalf(int i) {
        if (i < n) {
            int nStar = 4 * (n - i - 1) + 1;
            int nSpaces = Math.max(0, (maxLength - nStar) / 2);
            System.out.println(" ".repeat(nSpaces) + "*".repeat(nStar));
            printSecondHalf(i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of pattern: ");
        n = sc.nextInt();

        if (n <= 0) return;

        mid = (n + 1) / 2;
        maxLength = 4 * (mid - 1) + 1;

        printFirstHalf(0);
    }
}