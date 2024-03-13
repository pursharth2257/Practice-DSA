// Java program to insert an element in a specific position in an array.

import java.util.Arrays;

public class insertElement
{
	public static void main(String args[])
	{
		int myArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int insertIndex = 4;
		
		int insertValue = 0;
		
		System.out.println("Original Array : " + Arrays.toString(myArray));
		
		for (int i = myArray.length - 1; i > insertIndex; i--)
		{
			myArray[i] = myArray[i - 1];
		}
		
		myArray[insertIndex] = insertValue;
		
		System.out.println("Array after inserting the value : " + Arrays.toString(myArray));
	}
}