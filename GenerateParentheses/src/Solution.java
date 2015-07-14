import java.util.ArrayList;
import java.util.List;


public class Solution 
{
	public static List<String> generateParenthesis(int n) 
    {
        List list = new ArrayList<String>();
        String result = "";
        if (n == 0)
        	list.add(result);
        else
        {
        	for (int i = 0; i < n; i++)
        	{
        		List<String> mid = generateParenthesis(i);
        		List<String> tail = generateParenthesis(n - 1 - i);
        		for (String mresult : mid)
        		{
        			for (String tresult : tail)
        			{
        				list.add("(" + mresult + ")" + tresult);
        			}
        		}
        	}
        }
        return list;
    }
	
	public static void main(String []args)
	{
		List<String> result = generateParenthesis(3);
		for (String s : result)
		{
			System.out.print(s + "\n");
		}
	}
}
