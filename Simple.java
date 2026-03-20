class Business {
  String name;
  double profit, sales, margin, probablePurchase;
  String ifscCode;
  Business(String name, String ifscCode){
    this.name = name;
    this.ifscCode = ifscCode;
    System.out.println("Company is '" + this.name + "'(" + this.ifscCode + ").");
  }
  double annualProfit(double sales, double margin){
    this.sales = sales;
    this.margin = margin;
    if(this.margin >= (this.sales/2)){
      return (1.50*margin) - sales;
    }else{
      System.out.println("No good profit!");
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
        super(name, ifscCode); // Passes data to the Business constructor
        this.category = category;
    }
    public static void main(String[] args) {
        
        clothShop myShop = new clothShop("Urban Threads", "SBIN0012345", "Apparel");

        double profit = myShop.annualProfit(1000.0, 600.0);
        System.out.println("Calculated Profit: " + profit);

        double totalPurchase = myShop.annualPurchase(50.0);
        System.out.println("Total Annual Purchase Requirement: " + totalPurchase);
    }
}
