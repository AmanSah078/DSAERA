class Best_Buy_Sell_Stock {
	static void findthebestsell(int[] prices)
	{
		//1.st day koi bhi buy hi krega
		int BuyPrice= prices[0];
		int profit=0;
		int maxprofit=0;
		//Now 
		//It meaans 
		//no profit then jinta mein liya utna mein sell kr do 
		
		for(int i=1; i<prices.length; i++)
		{
			
		if(BuyPrice>prices[i])
		{
			///new minimum price
			BuyPrice=prices[i];
		}
//when Profit
			else {
				profit=prices[i]-BuyPrice;
				maxprofit=Math.max(maxprofit,profit);
			}
		}
		System.out.println(maxprofit);
		
	}
	public static void main(String[] args)
	{
		int[] prices={7,1,5,3,6,4};
		findthebestsell(prices);
	}
}