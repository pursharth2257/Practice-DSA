// Java program to reverse a string.

import java.util.*;
import java.util.Arrays;

public class reverseString
{
	public static String reverse(String s)
	{	
		String s1 = "";
		char ch;
		
		for (int i = 0; i < s.length(); i++)
		{
			ch = s.charAt(i);
			s1 = ch + s1;
		}
		return s1;
	}
	
	public static void main(String args[])
	{
		System.out.println(reverse("reverse"));
	}
}