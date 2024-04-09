// Java program to get a character from a given string.

import java.util.*;

public class getCharacter
{
	public static char getChar(String s, int index)
	{
		char ch = s.charAt(index);
		
		return ch;
	}
	
	public static void main(String args[])
	{
		System.out.println(getChar("String", 1));
	}
}