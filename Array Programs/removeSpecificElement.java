// Java program to remove a specific element from an array.

import java.util.Arrays;

public class removeSpecificElement
{
	public static void main(String args[])
	{
		int myArray[] = {1, 2, 3, 4, 5, 6, 7, 8};
		
		int removeIndex = 4;
		
		System.out.println("Original Array : " + Arrays.toString(myArray));
		
		for (int i = removeIndex; i < myArray.length - 1; i++)
		{
			myArray[i] = myArray[i + 1];
		}
		
		System.out.println("After Removing the specific element : " + Arrays.toString(myArray));
	}
}