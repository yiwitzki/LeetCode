


public class SIP {
	public static int searchInsert(int[] A, int target) 
    {
		String str = "asd";
		System.out.print(str.charAt(0));
		 int lo = 0;
		int hi = A.length - 1;
			while (lo <= hi)
			{
				int mid = (hi - lo) / 2 + lo;
				if (A[mid] > target)
		            hi = mid - 1;
		        else if (A[mid] < target)
		            lo = mid + 1;
		        else
		            return mid;
			}
	        return lo;
       
    }
    
    private static int binarysearch(int []A, int lo, int hi, int target)
    {
        if (hi <= lo)
            return lo;
        int mid = (hi - lo) / 2 + lo;
        if (A[mid] > target)
            binarysearch(A, lo, mid - 1, target);
        else if (A[mid] < target)
            binarysearch(A, mid + 1, hi, target);
        else
            return mid;
        return lo;
    }
    
    public static void main(String []args)
	{
    	int a[] = {1};
    	searchInsert(a,2);
	}
}
