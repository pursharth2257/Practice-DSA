/* Pattern 7 :

       A 
      A B 
     A B C
    A B C D 
   A B C D E
*/

public class pattern7
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
			
			char letter = 'A';
			
			for (int j = 1; j <= i; j++)
			{
				System.out.print(letter + " ");
				letter++;
			}
			System.out.println();
		}
	}
}