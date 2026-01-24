import java.util.Scanner;

class StarDiagonal {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int size, lineNumber;
        System.out.print("Enter the size of pattern (number of rows) :");
        size = scanner.nextInt();
        for(lineNumber = 0; lineNumber < size; lineNumber++){
            System.out.println((" ").repeat(lineNumber)+("*").repeat(size));
            }
        }
    }