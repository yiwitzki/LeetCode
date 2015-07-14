
public class MinimumPathSum 
{
	private int result = 0;
	public int minPathSum(int[][] grid) 
    {
		int m = grid.length;
		int n = grid[0].length;
		
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (i == 0 && j != 0)
					grid[i][j] = grid[i][j - 1];
				else if (i != 0 && j == 0)
					grid[i][j] = grid[i - 1][j];
				else if (i == 0 && j == 0)
					grid[i][j] = grid[i][j];
				else
					grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
			}
		}
        return grid[m - 1][n - 1];
    }
	
	public static int minPathSumDFS(int[][] grid) 
    {
		int m = grid.length;
		int n = grid[0].length;
		int visited[][] = new int[m][n];
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++)
				visited[i][j] = -1;
		}
		return DFS(grid, 0, 0, visited);
    }
	
	private static int DFS(int[][] grid, int x, int y, int[][] visited)
	{
		if (visited[x][y] != -1)
			return visited[x][y];
		int min = 0;
		if (x == grid.length - 1 && y == grid[0].length - 1)
			min = grid[x][y];
		else if (x == grid.length - 1)
			min = grid[x][y] + DFS(grid, x, y + 1, visited);
		else if (y == grid[0].length - 1)
			min = grid[x][y] + DFS(grid, x + 1, y, visited);
		else 
			min = grid[x][y] + Math.min(DFS(grid, x, y + 1, visited), DFS(grid, x + 1, y, visited));
		
		visited[x][y] = min;
		return min;
	}
	
	public static void main(String []args)
	{
		int array[][] = {{1,2,3},{4,5,6}};
		int min = minPathSumDFS(array);
		System.out.print(min);
	}
}
