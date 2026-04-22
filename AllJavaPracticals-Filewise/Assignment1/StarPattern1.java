import java.util.Scanner;

class StarPattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size, line, mid;
        System.out.print("Enter the size of pattern (width at the middle) :");
        size = scanner.nextInt();
	if(size>0 && size%2 != 0){
		mid = size/2;
		for(line = 0; line<size;line++){
			if(line==0||line==(size-1)){
				System.out.println(" ".repeat(mid)+"*");
			}
			else{
				System.out.println(" ".repeat(Math.abs(mid-line))+"*"+" ".repeat(size - 2*Math.abs(mid-line) -2)+"*");
			}
		}
		scanner.close();
	}else
		System.out.println("Cant print for zero or even or negative numbers");
	return;
    }
}