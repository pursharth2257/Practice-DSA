//Java program to test if an array contains a specific value.

public class ArraySpecificValue
{
	public static boolean contains(int myArray[], int num)
	{
		for (int n : myArray)
		{
			if (num == n)
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String args[])
	{
		int myArray[] = {4, 5, 6, 3, 2, 1, 8, 7};
		
		System.out.println(contains(myArray, 4));
		
		System.out.println(contains(myArray, 0));
	}
}