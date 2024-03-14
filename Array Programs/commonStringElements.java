// Java program to find common values between two arrays(string value).

import java.util.Arrays;

public class commonStringElements
{
	public static void main(String args[])
	{
		String myArray1[] = {"Apple", "Banana", "Cherry", "Mango"};
		String myArray2[] = {"Cherry", "BlueBerry", "Grapes", "Banana"};
		
		System.out.println("myArray1 : " + Arrays.toString(myArray1));
		System.out.println("myArray2 : " + Arrays.toString(myArray2));
		
		for (int i = 0; i < myArray1.length; i++)
		{
			for (int j = 0; j < myArray2.length; j++)
			{
				if (myArray1[i].equals(myArray2[j]))
				{
					System.out.println("Common Element : " + myArray1[i]);
				}
			}
		}
	}
}