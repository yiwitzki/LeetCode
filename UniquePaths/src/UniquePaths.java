
public class UniquePaths 
{
	
	public static int uniquePaths(int m, int n) 
    {
        if (m < 1 || n < 1)
            return 0;
        if (m == 1 && n == 1)
            return 1; 
        int [][]count = new int[m][n];
        for (int i = 0; i < m; i++)
        	count[i][0] = 1;
        for (int j = 0; j < n; j++)
        	count[0][j] = 1;
        for (int i = 1; i < m; i++)
        {
        	for (int j = 1; j < n; j++)
        	{
        		count[i][j] = count[i - 1][j] + count[i][j - 1];
        	}
        }
        return count[m - 1][n - 1];
        
     }
	
	 public static void main(String []args)
		{
		 	System.out.print(uniquePaths(3, 4));
		 	//System.out.print(uniquePaths(3, 4));
		}
}
