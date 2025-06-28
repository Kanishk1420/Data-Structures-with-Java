public class BuyandSell {
    public static int buy(int stocks[]){
        int buyingprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < stocks.length; i++) {
            if (buyingprice<stocks[i]) {
                int profit = stocks[i]-buyingprice;
                maxprofit = Math.max(maxprofit, profit);
            }
            else{
                buyingprice = stocks[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int stocks[] = {7, 6, 4, 3, 1};
       System.err.println(buy(stocks));
    }
}
