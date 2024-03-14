// Java program to find duplicates value in an array of integer values.

import java.util.Arrays;

public class findDuplicateIntegers
{
	public static void main(String args[])
	{
		int myArray[] = {1, 2, 2, 3, 4, 4, 5, 6};
		
		for (int i = 0; i < myArray.length - 1; i++)
		{
			for (int j = i + 1; j < myArray.length; j++)
			{
				if ((myArray[i] == myArray[j]) && (i != j))
				{
					System.out.println("Duplicate Value : " + myArray[j]);
				}
			}
		}
	}
}