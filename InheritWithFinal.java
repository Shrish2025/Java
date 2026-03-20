import java.util.Scanner;

class Calculator {
    public static final double E_CONSTANT = 2.71;
    public final String EQUALS_SIGN;

    static {
        System.out.println("--- Welcome to Calculator Module ---");
    }

    {
        EQUALS_SIGN = " = ";
        System.out.println("System Ready.");
    }

    public static final double addition(double a, double b) {
        return a + b;
    }

    public final double roundOff(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}

class ScientificCalc extends Calculator {
    public final double powerOfTen;

    ScientificCalc(double exponent) {
        this.powerOfTen = Math.pow(10, exponent);
    }

    void displayResult(double result) {
        System.out.println("Result" + EQUALS_SIGN + result);
    }
}

class CalcRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Accessing E: " + ScientificCalc.E_CONSTANT);

        System.out.print("Enter an exponent for your power-of-ten constant: ");
        double exp = sc.nextDouble();

        ScientificCalc myCalc = new ScientificCalc(exp);

        System.out.print("Enter two numbers to add: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        double sum = Calculator.addition(n1, n2); 
        double rounded = myCalc.roundOff(sum);

        myCalc.displayResult(rounded);
        System.out.println("Your power-of-ten value is: " + myCalc.powerOfTen);
        
        sc.close();
    }
}
