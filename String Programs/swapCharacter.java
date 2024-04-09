// Java program to swap characters of a string.

import java.util.*;

public class swapCharacter
{
	public static String swapChar(String s, int index1, int index2)
	{
		if (s == null || s.isEmpty())
		{
			return s;
		}
		
		char[] ch = s.toCharArray();
	
		char temp = ch[index1];
		ch[index1] = ch[index2];
		ch[index2] = temp;
		
		return new String(ch);
	}
	
	public static void main(String args[])
	{
		System.out.println(swapChar("String", 0, 5));
	}
}