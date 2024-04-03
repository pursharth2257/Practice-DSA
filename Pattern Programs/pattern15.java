/* Pattern 15 :

   A B C D E
    A B C D
	 A B C
	  A B
	   A
*/

public class pattern15
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
			
			for (char j = 'A'; j <= 'A' + (rows - i); j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}