public class BestStockPrice {
    public static int bestPrice(int[] prices){
        int buyPrice = Integer. MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice < prices[i]){
                int currentProfit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, currentProfit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(bestPrice(arr));
    }
}
