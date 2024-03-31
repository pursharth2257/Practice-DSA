/* Pattern 10 :

   * * * * *
   * * * *
   * * *
   * *
   *
*/

public class pattern10
{
	public static void main(String args[])
	{
		int rows = 5;
		
		for (int i = 1; i <= rows; i++)
		{
			for (int k = 1; k <= rows - i + 1; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}