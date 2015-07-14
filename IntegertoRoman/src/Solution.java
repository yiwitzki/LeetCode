import java.util.HashMap;
import java.util.LinkedHashMap;



public class Solution {
    private static LinkedHashMap<Integer, String> numToRoman = new LinkedHashMap<Integer, String>();
    public static String intToRoman(int num) 
    {
        int number = num;
        String[] symbol_array = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] number_array = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        for (int i = 0; i < symbol_array.length; i++)
        {
            numToRoman.put(number_array[i], symbol_array[i]);
        }
        /*int i = 0;*/
        StringBuilder result = new StringBuilder();
        /*while (number != 0)
        {
            while (number >= number_array[i])
            {
                number -= number_array[i];
                result.append(symbol_array[i]);
            }
            i++;
        }*/
        for (Integer i : numToRoman.keySet())
        {
            while (number >= i)
            {
                number -= i;
                result.append(numToRoman.get(i));
            }
            
        }
        return result.toString();
    }
    public static void main(String []args)
   	{
       	
    	System.out.print(intToRoman(511));
   	}
   
}