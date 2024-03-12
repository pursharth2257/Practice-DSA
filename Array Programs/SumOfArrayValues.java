public class SumOfArrayValues
{
	public static void main(String args[])
	{
		int myArray[] = {4, 5, 6, 2, 4, 7, 8};
		int sum = 0;
		
		for (int i = 0; i < myArray.length; i++)
		{
			sum += myArray[i]; 
		}
		
		System.out.println("The sum of values of array is : " + sum);
	}
}