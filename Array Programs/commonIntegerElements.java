// java program to find common values between two integers array.

import java.util.Arrays;

public class commonIntegerElements
{
	public static void main(String args[])
	{
		int myArray1[] = {1, 2, 3, 4, 5, 8};
		int myArray2[] = {3, 6, 7, 9, 0, 2};
		
		System.out.println("myArray1 : " + Arrays.toString(myArray1));
		System.out.println("myArray2 : " + Arrays.toString(myArray2));
		
		for (int i = 0; i < myArray1.length; i++)
		{
			for (int j = 0; j < myArray2.length; j++)
			{
				if (myArray1[i] == myArray2[j])
				{
					System.out.println("Duplicate Value : " + myArray1[i]);
				}
			}
		}
	}
}