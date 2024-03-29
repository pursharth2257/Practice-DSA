/* Pattern 8 :

       * 
      *** 
     *****
    ******* 
   *********
*/

public class pattern8
{
	public static void main(String args[])
	{
		int rows = 5;
		
		for (int i = 1; i <= rows; i++)
		{
			for (int k = 1; k < rows - i + 1; k++)
			{
				System.out.print(" ");
			}
			
			for (int j = 1; j <= (2 * i) - 1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}