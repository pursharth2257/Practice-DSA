// Java program to find duplicates in an array of string values.

import java.util.Arrays;

public class findDuplicateString
{
	public static void main(String args[])
	{
		String myArray[] = {"abc", "bcd", "abc", "bca", "bcd", "bgd"};
		
		for (int i = 0; i < myArray.length - 1; i++)
		{
			for (int j = i + 1; j < myArray.length; j++)
			{
				if ((myArray[i].equals(myArray[j]) && (i != j)))
				{
					System.out.println("Duplicate Value : " + myArray[j]);
				}
			}
		}
	}
}