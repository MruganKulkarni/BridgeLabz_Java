class ProfitLoss {
    public static void main(String[] args) {
        double costPrice = 129;
        double sellingPrice = 191;
        double profit = sellingPrice - costPrice;
        double profitPercent = profit / costPrice * 100;
        //printing in a single statement as mentioned in the problem statement
        
        System.out.println("The Cost Price is INR " + costPrice + 
                           " and Selling Price is INR " + sellingPrice +
                           "\nThe Profit is INR " + profit + 
                           " and the Profit Percentage is " + profitPercent);
    }
}
