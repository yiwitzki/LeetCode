
public class Solution 
{
	 public static int hammingWeight(int n) 
	 {
		 int result = 0;
		 while (n != 0)
		 {
			 if ((n & 1) == 1)
				 result ++;
			 n = n >>> 1;
		 }
		 return result;
	 }
	 
	 public static void main(String []args)
	 {
		// System.out.print(1 % 2);
		 System.out.print(hammingWeight(11)); 
	 }
}
