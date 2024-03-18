// Java program to find the missing number in an array.

public class missingNumber
{
	public static int findMissingNumber(int myArray[])
	{
		int n = myArray.length + 1;
		
		int sum = n * (n + 1)/2;
		
		for (int num : myArray)
		{
			sum = sum - num;
		}
		return sum;
	}
	
	public static void main(String args[])
	{
		int myArray[] = {4, 3, 5, 1, 6, 7, 9, 8};
		
		int num = findMissingNumber(myArray);
		
		System.out.println("Missing Number is : " + num);
	}
}