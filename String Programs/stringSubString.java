// Java program to splitting a string into sub strings.

import java.io.*;
import java.util.ArrayList;

public class stringSubString
{
	public static ArrayList<String> splitString(String s)
	{
		ArrayList<String> subStringList = new ArrayList<>();
		
		for (int i = 0; i < s.length(); i++)
		{
			for (int j = i + 1; j < s.length(); j++)
			{
				subStringList.add(s.substring(i, j));
			}
		}
		
		return subStringList;
	}
	
	public static void main(String args[])
	{
		ArrayList<String> subStringList = splitString("Hello World");
		
		System.out.println(subStringList);
	}
}