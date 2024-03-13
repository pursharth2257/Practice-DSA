// Java program to copy an array by iteratiing an array.

import java.util.Arrays;

public class copyArray
{
	public static void main(String args[])
	{
		int myArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int[] newArray = new int[9];	
		
		System.out.println("myArray : " + Arrays.toString(myArray));
		
		for (int i = 0; i < myArray.length; i++)
		{
			newArray[i] = myArray[i];
		}
		
		System.out.println("newArray : " + Arrays.toString(newArray));
	}
}