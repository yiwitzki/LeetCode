
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;



public class MajorityElement 
{
	
	public MajorityElement(int[] num, int index) 
    {
		int n = select(num, 0, num.length - 1, index);
        System.out.print(n);
    }
    private int partition(int[] num,int lo,int hi)
    {
   
        int i = lo, j = hi + 1;
        int pivot = num[lo];
        while (true)
        {
        	while (num[++i] < pivot)
        	{
        		if (i == hi)
        			break;
        		
        	}
        	while (num[--j] > pivot)
        	{
        		if (j == lo)
        			break;
        		
        	}
        	if (i >= j)
        		break;
        	swap(num, i, j);
        }
        swap(num, lo, j);
        return j;
    }
    
    private int select(int []num, int min, int max, int index)
    {
    	int tmp1 = 0;
		while (min < max)
		{
			tmp1 = partition(num, min, max);
			//tmp1 -= min;
			if (tmp1 < index)
			{
				min = tmp1 + 1;
			}
				
			else if (tmp1 > index)
			{
				/*max = tmp1 + min - 1;*/
				max = tmp1 - 1;
			}
				
			else 
				return num[index];
		}
		return num[index];
    }
    
    private void swap(int []num, int a, int b)
    {
    	int tmp = num[a];
    	num[a] = num[b];
    	num[b] = tmp;
    }
    
    public static void main(String []args)
	{
    	int []a = new int[90000000];
    	int []b = {32,41,21,29,7,53,97,76,71,53,53,53,72,53,53,14,22,53,67,53,53,53,54,98,53,46,53,53,62,53,76,20,60,53,31,53,53,53,95,27,53,53,53,53,36,59,40,53,53,64,53,53,53,21,53,51,53,53,2,53,53,53,53,53,50,53,53,53,23,88,3,53,61,19,53,68,53,35,42,53,53,48,34,54,53,75,53,53,50,44,92,41,71,53,53,82,53,53,14,53};
    	int []c = {6,5,5};
    	int []d = new int [900];
    	for (int i = 0; i < a.length; i++)
    		a[i] = 1;
    	for (int i = 0; i < d.length; i++)
    		d[i] = i;
    	int n = c.length / 2;
    	long startTime=System.currentTimeMillis(); 
    	MajorityElement rs = new MajorityElement(c, n);
    	long endTime=System.currentTimeMillis();
    	System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
    	long startTime1=System.currentTimeMillis(); 
    	Arrays.sort(a);
    	long endTime1=System.currentTimeMillis();
    	System.out.println("程序运行时间： "+(endTime1-startTime1)+"ms");
    	System.out.print(a[a.length / 2]);
		
	}
}
