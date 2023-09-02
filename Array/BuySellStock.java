
public class BuySellStock { //time complexity O(n)
    public static int buyAndSellStocks(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            if(buyprice < prices[i]){ //Profit
                int profit=prices[i]-buyprice; //today's profit
                maxProfit=Math.max(maxProfit,profit);


            }else{
                buyprice =prices[i];
            }
        }
    
    return maxProfit;
    }
public static void main(String[] args) {
    int prices[]={7,1,5,3,6,4};
    System.out.println(buyAndSellStocks(prices));
}
}