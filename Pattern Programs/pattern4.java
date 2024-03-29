/* Pattern 4 :

   A
   A B
   A B C
   A B C D
   A B C D E
*/

public class pattern4
{
	public static void main(String args[])
	{
		for (int i = 1; i <= 5; i++)
		{
			for (char j = 'A'; j < 'A' + i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}