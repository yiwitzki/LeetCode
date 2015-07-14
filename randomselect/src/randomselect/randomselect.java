package randomselect;

import java.util.Scanner;

public class randomselect {
	private int []array;
	private int tmp = 5;
	public randomselect()
	{
		array =  new int [tmp];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < tmp; i++)
		{
			array[i] = s.nextInt();
		}
	}
	
	private int partition(int min, int max)
	{
		int i = min, j = max;
		int pivot = array[min];
		while (true)
		{
			while (array[++i] < pivot)
				if (i == max)
					break;
			while (array[j--] > pivot)
				if (j == min)
					break;
			if (i > j)
				break;
			exchange(array, i, j);
		}
		
		exchange(array, min, j);
		return j;
	}
	
	private void exchange(int []earray, int p, int q)
	{
		int tmp = earray[p];
		earray[p] = earray[q];
		earray[q] = tmp;
	}
	
	public int select(int min, int max, int index)
	{
		int tmp1 = 0;
		while (min < max)
		{
			tmp1 = partition(min, max);
			if (tmp1 < index)
				min++;
			else if (tmp1 > index)
				max--;
			else 
				return array[tmp1];
		}
		return array[tmp1];
	}
	
	public static void main(String []args)
	{
		randomselect rs = new randomselect();
		int j = rs.select(0, 4, 0);
		System.out.print(j);
	}
}
