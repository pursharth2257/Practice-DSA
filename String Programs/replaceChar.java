// Java program to replace a character at a specific index.

import java.util.*;
import java.util.Arrays;

public class replaceChar
{
	public static String replace(String s, int index, char c)
	{
		char[] ch = s.toCharArray();
		
		for (int i = 0; i < ch.length; i++)
		{
			if (i == index)
			{
				ch[i] = c;
			}
		}
		
		return new String(ch);
	}
	
	public static void main(String args[])
	{
		System.out.println(replace("String", 2, 'a'));
	}
}