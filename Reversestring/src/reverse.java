
public class reverse {
	public static String reverseWords(String s) {
		String stripppedString = s.trim();
        String []str = stripppedString.split("\\s+");


        	 StringBuilder sb = new StringBuilder();
        	 for (int i = str.length - 1; i >= 0; i--)
        	 {
        		sb.append(str[i]);
        		if(i > 0 && str[i - 1] != "")	
        			sb.append(' ');
        	 }
        	 return sb.toString();
        	
       
    }
	public static void main(String []args)
	{
		String s = " 123 4567";
		s = reverseWords(s);
		System.out.print(s);
		/*String []str = "2|33|4".split("\\|");
		for (int i = 0; i <= str.length - 1; i++)
			System.out.print(str[i] + '\n');*/
		
	}
}
