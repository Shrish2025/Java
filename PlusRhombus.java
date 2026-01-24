import java.util.Scanner;

class PlusRhombus {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int size, lineNumber;
        System.out.print("Enter the size of pattern (width at the middle) :");
        size = scanner.nextInt();
        for(lineNumber = 1; lineNumber <= size; lineNumber++){
            System.out.println((" ").repeat(size-lineNumber)+("+ ").repeat(lineNumber));
            }
        for(lineNumber = size-1; lineNumber >= 1; lineNumber--){
            System.out.println((" ").repeat(size-lineNumber)+("+ ").repeat(lineNumber));
            }
        }
    }