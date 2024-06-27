import java.util.*;

class Sample
{
	public static void main(String args[])
	{
		System.out.print("Enter any String : ");
		
		Scanner s = new Scanner(System.in);
		String x = s.nextLine();
		
		String str = removeSpace(x);
		System.out.println("String without spaces  : "+str);
	}
	
	public static String removeSpace(String input)
	{
		StringBuilder output = new StringBuilder();
		char[] chArray = input.toCharArray();
		
		for(char c : chArray)
		{
			if(!Character.isWhitespace(c))
				output.append(c);
		}
		
		return output.toString();
	}
}
