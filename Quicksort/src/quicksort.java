public class quicksort {
	private static int partition(int[] A,int lo, int hi)
	{
		int pivot = A[lo];
	    int i = lo, j = hi + 1;
	    while (true)
	    {
	    	while (A[++i] < pivot)
	        {
	    		if (i == hi)
	    			break;
	        }
	        while (A[--j] > pivot)
	        {
	            if (j == lo)
	            	break;
	        }
	        if (i >= j)
	            break;
	        exchange(A,i,j);
	      }
	    exchange(A, lo, j);
	    return j;
	        
	  }
	
	private static void exchange(int []earray, int p, int q)
	{
		int tmp = earray[p];
		earray[p] = earray[q];
		earray[q] = tmp;
	}
	
	public static void sort(int[] A, int lo, int hi)
	{
		if (lo >= hi)
			return;
		int index = partition(A, lo, hi);
		if (index - 1 > lo)
			sort(A, lo, index - 1);
		if (index  < hi)
			sort(A,index + 1, hi);
	}
	
	public static void main(String []args)
	{
		/*int []a = {2,1,5,4,7,6,1,2};*/
		int []a = {0};
		sort(a,0,a.length - 1);
		for (int i = 0;i < a.length; i++)
			System.out.print(a[i] + " ");
	}
}
