public class Buy_Sell_StocksII {
public static void main(String[] args) {
    int maxprofit = 0;
    int prices[] = {7,1,5,3,6,4};
    for (int i = 0; i < prices.length-1; i++) {
        if (prices[i+1]>prices[i]) {
            maxprofit+=prices[i+1]-prices[i];
        }
    }
    System.out.println("Total maxprofit is "+maxprofit);
    // in this question what we did here is caluculating total profit well in last instead finding maxproft of each day just like in previous question
}
    
}