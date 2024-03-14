// Java program to remove duplicate value from an array.

import java.util.Arrays;

public class removeDuplicate
{
	public static int removeDuplicateElement(int myArray[], int n)
	{
		Arrays.sort(myArray);
		
		if (n == 0 || n == 1)
		{
			return n;
		}
		
		int j = 0;
		
		for (int i = 0; i < n - 1; i++)
		{
			if (myArray[i] != myArray[i + 1])
			{
				myArray[j++] = myArray[i];
			}
		}
		
		myArray[j++] = myArray[n - 1];
		
		return j;
	}
	
	public static void main(String args[])
	{
		int myArray[] = {4, 5, 3, 9, 9, 4, 7, 6, 2, 1};
		
		int n = myArray.length;
		
		int j = 0;
		
		j = removeDuplicateElement(myArray, n);
		
		for (int i = 0; i < j; i++)
		{
			System.out.print(myArray[i] + " ");
		}
	}
}