// Java program to check wether a string is palindrome or not.

public class palindromeString
{
	public static boolean checkPalindrome(String s)
	{
		int i = 0;
		int j = s.length() - 1;
		
		while (i < j)
		{
			if (s.charAt(i) != s.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String args[])
	{
		System.out.println(checkPalindrome("YAYAY"));
		System.out.println(checkPalindrome("qdkqdaf"));
	}
}