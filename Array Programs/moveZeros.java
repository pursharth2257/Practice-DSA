// Java program to move all the 0 element to the end of the array.

public class moveZeros
{
	public static void move_zeros(int myArray[])
	{
		int j = 0;
		
		for (int i = 0; i < myArray.length; i++)
		{
			if (myArray[i] != 0 && myArray[j] == 0)
			{
				int temp = myArray[i];
				myArray[i] = myArray[j];
				myArray[j] = temp;
			}
			
			if (myArray[j] != 0)
			{
				j++;
			}
		}
	}
	
	public static void main(String args[])
	{
		int myArray[] = {1, 0, 5, 6, 0, 3, 2, 89, 0};
		
		move_zeros(myArray);
		
		for (int i = 0; i < myArray.length; i++)
		{
			System.out.print(myArray[i] + " ");
		}
	}
}