import java.util.Arrays;

public class SortArrays
{
	public static void main(String args[])
	{
		int myArray1[] = {6, 5, 3, 2, 7, 1, 4};
		
		String myArray2[] = {"n", "a", "p", "l", "z", "f"};
		
		System.out.println("Original Array : " + Arrays.toString(myArray1));
		
		Arrays.sort(myArray1);
		
		System.out.println("Sorted Array : " + Arrays.toString(myArray1));
		
		System.out.println("Original Array : " + Arrays.toString(myArray2));
		
		Arrays.sort(myArray2);
		
		System.out.println("Sorted Array : " + Arrays.toString(myArray2));
	}
}