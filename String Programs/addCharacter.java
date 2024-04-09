// Java program to add character to a string.

public class addCharacter
{
	public static String addChar(String s, char c)
	{
		String s1 = "";
		
		s1 = s + c;
		
		return s1;
	}
	
	public static void main(String args[])
	{
		System.out.println(addChar("addCha", 'r'));
	}
}