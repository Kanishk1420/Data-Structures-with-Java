public class Solution {
    public static int  Stocks(int n[]) {
        int buyingPrice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < n.length; i++) {
            if (buyingPrice<n[i]) {
                int profit = n[i] - buyingPrice;
                maxprofit = Math.max(maxprofit, profit);
            }
            else {
                buyingPrice = n[i];
                
            }
        }
        return maxprofit;
    }
    
    public static void main(String[] args) {
       int n[] = {7,1,5,3,6,4};
       System.err.println(Stocks(n));
    }
}