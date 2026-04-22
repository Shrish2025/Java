import java.util.Scanner;

public class MakeDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String number = scanner.nextLine();
        if ((number.charAt(0) == '#' && number.charAt(1) >= '1' && number.charAt(1) <= '9') ||
            (number.charAt(0) == '0' && (number.charAt(1) == 'x' || number.charAt(1) == 'X'))) {
            System.out.println("Entered Hexadecimal Number");
            String value = (number.charAt(0) == '#') ? number.substring(1) : number.substring(2);
            int decimal = Integer.parseInt(value, 16);
            System.out.println("Decimal value: " + decimal);
        } else if (number.charAt(0) == '0' && number.charAt(1) >= '1' && number.charAt(1) <= '9') {
            System.out.println("Entered Octal Number");
            int decimal = Integer.parseInt(number.substring(1), 8);
            System.out.println("Decimal value: " + decimal);
        } else if (number.charAt(0) == '0' && number.charAt(1) == 'b') {
            System.out.println("Entered Binary Number");
            int decimal = Integer.parseInt(number.substring(2), 2);
            System.out.println("Decimal value: " + decimal);
        } else {
            System.out.println("Entered the integer number: " + number);
        }
        scanner.close();
    }
}