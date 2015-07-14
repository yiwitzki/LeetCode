import java.util.ArrayList;
import java.util.List;


public class GrayCode 
{
	public GrayCode()
	{
		
	}
	
	public List<Integer> grayCode(int n) 
    {
        List<Integer> result = new ArrayList<Integer>();
        int[] bit = new int[n];
        result.add(0);
        for (int i = 0; i < n; i++)
        {
        	int count = 1 << i;
        	for (int k = result.size() - 1; k >= 0; k--)
        	{
        		result.add(result.get(k) + count);
        	}
        	
        }
        return result;
    }
}
