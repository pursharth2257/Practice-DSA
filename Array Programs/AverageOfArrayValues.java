//Java program to find the average of array values.

public class AverageOfArrayValues
{
	public static void main(String args[])
	{
		int myArray[] = {24, 54, 33, 13, 34, 60};
		int sum = 0;
		
		for (int i = 0; i < myArray.length; i++)
		{
			sum += myArray[i];
		}
		
		double Average = sum/myArray.length;
		
		System.out.println("The average of array values is : " + Average);
	}
}