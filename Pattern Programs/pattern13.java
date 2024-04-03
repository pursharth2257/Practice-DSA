/* Pattern 13 :

   * * * * *
    * * * * 
	 * * * 
	  * *
	   *
*/

public class pattern13
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
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}