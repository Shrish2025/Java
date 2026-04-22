import java.util.Scanner;

public class StarPattern3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter size: ");
        int size = scanner.nextInt();
        
        if (size % 2 == 0) size++; 

        int midPoint = size / 2;

        for (int currentRow = 0; currentRow < size; currentRow++) {
            int offset = (currentRow <= midPoint) 
                         ? currentRow 
                         : (size - 1 - currentRow);

            int leftBoundary = midPoint - offset;
            int rightBoundary = midPoint + offset;

            for (int currentCol = 0; currentCol <= rightBoundary; currentCol++) {
                if (currentCol == leftBoundary || currentCol == rightBoundary) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}