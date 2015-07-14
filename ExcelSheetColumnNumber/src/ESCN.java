
public class ESCN 
{
	public ESCN()
	{
		
	}
	
	public int cul(String s)
	{
		int number = 0;
        for (int i = 0; i < s.length() ; i++)
        {
            number += (s.charAt(i) - 'A' + 1) * Math.pow(26, s.length() - 1 - i);
        }
        return number;
	}
	
	public int maxProfit(int[] prices) 
    {
        int arraylength = 0;
        int maxprofit = 0;
        if (prices.length < 2)
        {
            if (prices.length == 0)
                return maxprofit;
            else
            {
                if (prices[0] > 0)
                    return maxprofit += prices[0];
                else
                    return maxprofit;
            }
        }
        else
        {
        	int []diff = new int[prices.length - 1];
            for (int i = 0; i < prices.length - 1; i++)
            {
                diff[i] = prices[i + 1] - prices[i];
                if (diff[i] > 0)
                    maxprofit += diff[i];
            }
           
            return maxprofit;
        }
        
        
    }
	public static void main(String[] args)
	{
		String str = "AA";
		ESCN s = new ESCN();
		int []a = {1};
		System.out.print(s.maxProfit(a));
	}
}
