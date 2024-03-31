/* Pattern 12 :

   * * * * *
   * * * *
   * * *
   * *
   *
*/

public class pattern12
{
	public static void main(String args[])
	{
		int rows = 5;
		
		for (int i = 1; i <= rows; i++)
		{
			for (char k = 'A'; k <= 'A' + rows - i; k++)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}