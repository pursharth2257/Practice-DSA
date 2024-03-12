//Java program to find the index of an array element

import java.util.OptionalInt;

public class ArrayElementIndex
{
	public static OptionalInt findIndex(int myArray[], int num)
	{
		if (myArray == null)
		{
			return OptionalInt.empty();
		}
		
		int length = myArray.length;
		int i = 0;
		
		while (i < length)
		{
			if (myArray[i] == num)
			{
				return OptionalInt.of(i);
			}
			else
			{
				i = i + 1;
			}
		}
		return OptionalInt.empty();
	}
	
	public static void main(String args[])
	{
		int myArray[] = {1, 2, 3, 4, 5, 6, 7};
		
		findIndex(myArray, 4).ifPresent(index -> System.out.println("The index of 4 is : " + index));
		
		findIndex(myArray, 11).ifPresent(index -> System.out.println("The index of 11 is : " + index));
		
	    findIndex(myArray, 1).ifPresent(index -> System.out.println("The index of 1 is : " + index));
	}
}