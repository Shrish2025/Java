import java.util.Scanner;

class PrintLine {
    static String s;
    static double s1;
    static Scanner sc = new Scanner(System.in); // Single scanner instance

    static void p(Object o) {
        System.out.println(o);
    }

    static void input() { // Separate method for input to keep p() clean
        s = sc.nextLine();
    }
    
    static void inputDouble() {
        s1 = sc.nextDouble();
        sc.nextLine(); // Consume the leftover newline
    }
}
class Business extends PrintLine{
  String name;
  double profit, sales, margin, probablePurchase;
  String ifscCode;
  Business(String name, String ifscCode){
    this.name = name;
    this.ifscCode = ifscCode;
    p("Company is '" + this.name + "'(" + this.ifscCode + ").");
  }
  double annualProfit(double sales, double margin){
    this.sales = sales;
    this.margin = margin;
    if(this.margin >= (this.sales/2)){
      return (1.50*margin) - sales;
    }else{
      p("No good profit!");
      return 0.0;
    }
  }
  double annualPurchase(double probablePurchase){
    this.probablePurchase = probablePurchase;
//1.92 is rate of rise of goods, and 3.65 is annual daily percent
    return probablePurchase*3.65*1.92;
    }
}

  class clothShop extends Business {
    String category;
    
    clothShop(String name, String ifscCode, String category) {
// Passes data to the Business constructor
        super(name, ifscCode);
        this.category = category;
    }
}
class dryFruits extends Business {
    String category;
    
    dryFruits(String name, String ifscCode, String category) {
        super(name, ifscCode);
        this.category = category;
    }
}
public class Heirerchial {
    public static void main(String[] args) {
        PrintLine.p("Enter the business type (C/D), Company Name, IFSC code, and category:");
        
        PrintLine.input(); String business = PrintLine.s;
        PrintLine.input(); String businessName = PrintLine.s;
        PrintLine.input(); String businessCode = PrintLine.s;
        PrintLine.input(); String businessCategory = PrintLine.s;

        if (business.toUpperCase().startsWith("C")) {
            clothShop cS = new clothShop(businessName, businessCode, businessCategory);
            PrintLine.p("Enter margin, sales and future purchase quantity:");
            
            PrintLine.inputDouble(); double bMargin = PrintLine.s1;
            PrintLine.inputDouble(); double bSales = PrintLine.s1;
            PrintLine.inputDouble(); double bProbable = PrintLine.s1;

            PrintLine.p("Profit: " + cS.annualProfit(bSales, bMargin));
            PrintLine.p("Annual Purchase: " + cS.annualPurchase(bProbable));
        } else {
            dryFruits dF = new dryFruits(businessName, businessCode, businessCategory);
            PrintLine.p("Enter margin, sales and future purchase quantity :");
            
            PrintLine.inputDouble(); double bMargin = PrintLine.s1;
            PrintLine.inputDouble(); double bSales = PrintLine.s1;
            PrintLine.inputDouble(); double bProbable = PrintLine.s1;

            PrintLine.p("Annual Profit: " + dF.annualProfit(bSales, bMargin)); 
            PrintLine.p("Annual Purchase: " + dF.annualPurchase(bProbable));
        }
    }
}
