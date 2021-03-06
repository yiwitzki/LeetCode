


public class Solution 
{
	public static int[] productExceptSelf(int[] nums) 
    {
        int result[] = new int[nums.length];
        int tmp = 1;
        for (int i = 0; i < nums.length; i++)
        {
        	result[i] = tmp;
        	tmp *= nums[i];
        }
        tmp = 1;
        for (int i = nums.length - 1; i >= 0; i--)
        {
        	result[i] *= tmp;
        	tmp *= nums[i];
        }
        return result;
    }
	public static void main(String []args)
	{
		int num[] = {0,0};
		int result[] = productExceptSelf(num);
		for (int i = 0; i < result.length; i++)	
			System.out.print(result[i] + " ");
	}
}
