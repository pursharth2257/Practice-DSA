// java program to iterate over character in a string.

public class iterateCharacter
{
	public static void iterateChar(String s)
	{
		for (int i = 0; i < s.length(); i++)
		{
			System.out.print(s.charAt(i) + " ");
		}
	}
	
	public static void main(String args[])
	{
		iterateChar("abcdefghi");
	}
}