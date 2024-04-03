/* Pattern 14 :

   1 2 3 4 5
    1 2 3 4
	 1 2 3
	  1 2
	   1
*/

public class pattern14
{
	public static void main(String args[])
	{
		int rows = 5;
		
		for (int i = 1; i <= rows; i++)
		{
			for (int k = 1; k < i; k++)
			{
				System.out.print(" ");
			}
			
			for (int j = 1; j <= rows - i + 1; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}