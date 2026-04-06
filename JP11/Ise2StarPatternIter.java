import java.util.Scanner;

class Ise2StarPatternIter {
    static int n, mid, maxLength;

    static void printOdd() {
        mid = n / 2;
        maxLength = 4 * mid + 1;
        for (int i = 0; i <= mid; i++) {
            int nStar = 4 * i + 1;
            int nSpaces = (maxLength - nStar) / 2;
            System.out.println(" ".repeat(nSpaces) + "*".repeat(nStar));
        }
        for (int i = mid + 1; i < n; i++) {
            int nStar = 4 * (n - i - 1) + 1;
            int nSpaces = (maxLength - nStar) / 2;
            System.out.println(" ".repeat(nSpaces) + "*".repeat(nStar));
        }
    }

    static void printEven() {
        mid = n / 2;
        maxLength = 4 * (mid - 1) + 1;
        for (int i = 0; i < mid; i++) {
            int nStar = 4 * i + 1;
            int nSpaces = (maxLength - nStar) / 2;
            System.out.println(" ".repeat(nSpaces) + "*".repeat(nStar));
        }
        for (int i = mid; i < n; i++) {
            int nStar = 4 * (n - i - 1) + 1;
            int nSpaces = (maxLength - nStar) / 2;
            System.out.println(" ".repeat(nSpaces) + "*".repeat(nStar));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of pattern: ");
        n = sc.nextInt();

        if (n % 2 != 0) {
            printOdd();
        } else {
            printEven();
        }
    }
}