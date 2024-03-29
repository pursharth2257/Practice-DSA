/* Pattern 6 :

       1 
      1 2 
     1 2 3
    1 2 3 4 
   1 2 3 4 5
*/

public class pattern6
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
			
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}