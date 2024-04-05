// Java program to print even length word in a String.

public class evenLengthWords
{
	public static void printEven(String s)
	{
		String[] words = s.split(" ");
		
		for (String word : words)
		{
			if (word.length() % 2 == 0)
			{
				System.out.println(word);
			}
		}
	}
	
	public static void main(String args[])
	{
		String s = "Hello This is a String";
		printEven(s);
	}
}