// Java program to find the second maximum value in an array.

public class secondMax
{
	public static int findSecondMax(int myArray[])
	{
		int max = Integer.MIN_VALUE;
		int second_max = Integer.MIN_VALUE;
		
		for (int i = 0; i < myArray.length; i++)
		{
			if (myArray[i] > max)
			{
				second_max = max;
				max = myArray[i];
			}
			else if (myArray[i] > second_max && myArray[i] != max)
			{
				second_max = myArray[i];
			}
		}
		return second_max;
	}
	
	public static void main(String args[])
	{
		int myArray[] = {23, 45, 33, 12, 66, 45, 79};
		
		int second_max = findSecondMax(myArray);
		
		System.out.println(second_max);
	}
}