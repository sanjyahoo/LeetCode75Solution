package CodePackage;

public class StockBuyAndSell {

    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // new potential buy
            } else {
                int profit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, profit); // best profit so far
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int[] ar = {7,1,5,3,6,4};
        new StockBuyAndSell().maxProfit(ar);
    }
}
