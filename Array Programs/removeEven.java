// Java program to remove even integers from an array.

public class removeEven
{
	public static void printArray(int myArray[])
	{
		for (int i = 0; i < myArray.length; i++)
		{
			System.out.print(myArray[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] removeEvenInteger(int myArray[])
	{
		int oddCount = 0;
		
		for (int i = 0; i < myArray.length; i++)
		{
			if (myArray[i] % 2 != 0)
			{
				oddCount++;
			}
		}
		
		int[] result = new int[oddCount];
		
		int idx = 0;
		
		for (int i = 0; i < myArray.length; i++)
		{
			if (myArray[i] % 2 != 0)
			{
				result[idx] = myArray[i];
				idx++;
			}
		}
		
		return result;
	}
	
	public static void main(String args[])
	{
		int[] myArray = {1, 2, 3, 4, 5, 5, 6, 9, 7};
		printArray(myArray);
		
		int[] result = removeEvenInteger(myArray);
		printArray(result);
	}
}