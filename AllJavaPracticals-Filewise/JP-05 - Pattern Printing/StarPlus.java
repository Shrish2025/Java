import java.util.Scanner;

class StarPlus {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        	int size, lineNumber;
        	System.out.print("Enter the size of pattern (number of rows) :");
        	size = scanner.nextInt();
		if(size>0){
			for(lineNumber = 1; lineNumber <= size; lineNumber++){
        			if( 2*lineNumber <  2*size){
        				System.out.println(("*").repeat(lineNumber)+("+").repeat(2*size-2*lineNumber-1)+("*").repeat(lineNumber));
        			}
    				else{
        				System.out.println(("*").repeat(2*size-1));
				}
		        }
		}
		else
			System.out.println("Can't print for 0 or negative numbers.");
        	scanner.close();
		return;
	}
}