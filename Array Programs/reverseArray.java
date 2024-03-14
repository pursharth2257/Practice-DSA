// Java program to reverse an array of integers value.

import java.util.Arrays;

public class reverseArray
{
	public static void main(String aregs[])
	{
		int myArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.println("Original Array : " + Arrays.toString(myArray));
		
		for (int i = 0; i < myArray.length / 2; i++)
		{
			int temp = myArray[i];
			myArray[i] = myArray[myArray.length - i - 1];
			myArray[myArray.length - i - 1] = temp;
		}
		
		System.out.println("Reverse Array : " + Arrays.toString(myArray));
	}
}