package com.company;

public class Solution
{
    public static int findMin(int[] num)
    {
        int low = 0, high = num.length - 1;
        while(high - low > 1)
        {
            while ((high - low > 1) && num[low] == num[high])
                low++;
            int mid = low + (high - low) / 2;
            if (num[low] <= num[mid] && num[mid] <= num[high])
                return num[low];
            if (num[low] > num[mid])
                high = mid;
            if (num[mid] > num[high])
                low = mid;
        }
        if (low == high)
            return num[low];
        else
            return num[low] < num[high] ? num[low] : num[high];
    }
    public static void main(String[] args)
    {
	// write your code here
        int []a = {0, 1, 2, 2, 2};
        System.out.print(findMin(a));
    }
}
