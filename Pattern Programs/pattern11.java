/* Pattern 11 :

   1 2 3 4 5
   1 2 3 4
   1 2 3
   1 2
   1
*/

public class pattern11
{
	public static void main(String args[])
	{
		int rows = 5;
		
		for (int i = 1; i <= rows; i++)
		{
			for (int k = 1; k <= rows - i + 1; k++)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}