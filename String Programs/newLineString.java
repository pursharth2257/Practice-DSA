// Java program to print a new line in a string.

public class newLineString
{
	public static void main(String args[])
	{
		System.out.println("Hello" + "\n" + "World");
		
		String newline = System.lineSeparator();
		
		System.out.println("Hello" + newline + "World");
	}
}