package subarray;

public class subarray 
{
	public subarray(int[] A)
	{
		int max_sum = 0;
		int current = 0;
		int n = A.length;
		for (int i = 0; i < n; i++)
		{
			current += A[i];
			if (current < A[i])
				current = A[i];
			if (max_sum < current)
				max_sum = current;
		}
		System.out.print(max_sum);
	}
	
	 
    public static void main(String []args)
	{
    	int a[] = {-2,1,-3,4,-1,2,1,-5,4};
    	subarray sb = new subarray(a);
    	
	}
}
