// Java program to convert a string to a string array.

public class stringArray
{
	public static void toArray(String s)
	{
		String[] sArr = s.split(" ");
		
		for (int i = 0; i < sArr.length; i++)
		{
			System.out.print(sArr[i] + ", ");
		}
	}
	
	public static void main(String args[])
	{
		toArray("This is a String");
	}
}