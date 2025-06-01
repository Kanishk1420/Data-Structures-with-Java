public class Buy_Sell_Stocks {
public static int stocks(int stock[]){
    // int profit = Selling Price - Buy Price
    int Buying = Integer.MAX_VALUE;
    int maxprofit = 0;
    for (int i = 0; i < stock.length; i++) {
        if (Buying<stock[i]) {
            int profit = stock[i]-Buying;
            maxprofit = Math.max(maxprofit, profit);
        }
        else {
            Buying = stock[i];
        }
    }
    return maxprofit;
}
public static void main(String[] args) {
    int stock[] = {7,1,5,3,6,4};
    System.err.println("The maximum stock is "+stocks(stock));
}
    
}
