import java.util.Scanner;

class IntSymmRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size, lineNumber;
        int count;
        System.out.print("Enter the size of pattern (width at the middle) :");
        size = scanner.nextInt();
        for (lineNumber = 1; lineNumber <= size; lineNumber++) {
            System.out.print(" ".repeat(size - lineNumber));
            count= lineNumber;
            for (int row1 = 0; row1 < lineNumber; row1++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
        for(lineNumber = size-1; lineNumber >= 1; lineNumber--){
            System.out.print(" ".repeat(size - lineNumber));
            count = lineNumber;
            for(int row2 = lineNumber; row2 > 0; row2--){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}