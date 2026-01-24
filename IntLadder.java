import java.util.Scanner;

class IntLadder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size, lineNumber;
        int count=1;
        System.out.print("Enter the size of pattern (number of rows) :");
        size = scanner.nextInt();
        for (lineNumber = 1; lineNumber <= size; lineNumber++) {
            for (int row1 = 0; row1 < lineNumber; row1++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}