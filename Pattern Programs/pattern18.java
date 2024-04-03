/* Pattern 18 :

   ABCDEFGHI
    ABCDEFG
	 ABCDE
	  ABC
	   A
*/

public class pattern18
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
			
			for (char j = 'A'; j <= 'A' + ((2 * rows) - (2 * i)); j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}