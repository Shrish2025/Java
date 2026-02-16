import java.util.Scanner;

class StarPattern2 {
	    public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);
	        int size, centre;
	        System.out.print("Enter the size of pattern (width at the middle) :");
	        size = scanner.nextInt();
		centre = size/2;
		for(int i = 0; i< size; i++){
			for(int j =0; j<size;j++){
				if(Math.abs(centre-i)+Math.abs(centre-j)==centre){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}