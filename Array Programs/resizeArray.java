// Java program to resize an array.

public class resizeArray
{
	public static int[] resize(int myArray[], int Capacity)
	{
		int[] temp = new int[Capacity];
		
		for (int i = 0; i < myArray.length; i++)
		{
			temp[i] = myArray[i];
		}
		myArray = temp;
		return myArray;
	}
	
	public static void main(String args[])
	{
		int myArray[] = {1, 3, 2, 4, 5};
		
		myArray = resize(myArray, 10);
		
		System.out.println("Size of Array after resizing : " + myArray.length);
	}
}