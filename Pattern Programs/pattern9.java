/* Pattern 9 :

            A 
          A B C
        A B C D E
      A B C D E F G
    A B C D E F G H I
*/

public class pattern9
{
	public static void main(String args[])
	{
		int rows = 5;
		
		for (int i = 1; i <= rows; i++)
		{
			for (int k = 1; k < ((2 * rows) - (2 * i)); k++)
			{
				System.out.print(" ");
			}
			
			char letter = 'A';
			
			for (int j = 1; j <= 2 * i - 1; j++)
			{
				System.out.print(letter + " ");
				letter++;
			}
			System.out.println();
		}
	}
}