public class BuyAndSellStock
{
    public static int BuySellStock(int prices[])
    {
        int BuyPrices=Integer.MAX_VALUE;
        int MaxProfit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(BuyPrices<prices[i]) {
                int profit = prices[i] - BuyPrices;
                MaxProfit = Math.max(MaxProfit, profit);
            }
            else {
                BuyPrices=prices[i];
            }
        }
        return MaxProfit;
    }
    public static void main(String args[])
    {
        int prices[]={7,1,5,3,6,4};
        System.out.println(BuySellStock(prices));
    }
}
