// Java string program to check anagram.

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class anagramStrings
{
	public  static boolean checkAnagram(String s1, String s2)
	{
		int n1 = s1.length();
		int n2 = s2.length();
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		if (n1 != n2)
		{
			return false;
		}
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for (int i = 0; i < ch1.length; i++)
		{
			if (ch1[i] != ch2[i])
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String args[])
	{
		System.out.println(checkAnagram("silent", "listen"));
		System.out.println(checkAnagram("healo", "hello"));
		
	}
}