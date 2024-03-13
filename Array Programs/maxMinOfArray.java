// Java program to find the minimum and maximum value of an array.

import java.util.Arrays;

public class maxMinOfArray
{
	static int max;
	static int min;
	
	public static void max_min(int myArray[])
	{
		max = myArray[0];
		min = myArray[0];
		int len = myArray.length;
		
		for (int i = 1; i < len - 1; i = i + 2)
		{
			if (i + 1 > len)
			{
				if (myArray[i] > max) max = myArray[i];
				if (myArray[i] < min) min = myArray[i];
			}
			
			if (myArray[i] > myArray[i + 1])
			{
				if (myArray[i] > max) max = myArray[i];
				if (myArray[i + 1] < min) min = myArray[i + 1];
			}
			
			if (myArray[i] < myArray[i + 1])
			{
				if (myArray[i] < min) min = myArray[i];
				if (myArray[i + 1] > max) max = myArray[i + 1];
			}
		}
	}
	
	public static void main(String args[])
	{
		int myArray[] = {4, 7, 6, 4, 2, 1, 8, 9, 10, 5};
		
		max_min(myArray);
		
		System.out.println("Maximum value in the array is : " + max);
		
		System.out.println("Minimum value in the array is : " + min);
	}
}