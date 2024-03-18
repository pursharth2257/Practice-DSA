// Java program to check whether the given string is palindrome.

public class palindrome
{
	public static boolean isPalindrome(String s)
	{
		char[] charArray = s.toCharArray();
		
		int start = 0;
		
		int end = s.length() - 1;
		
		while (start < end)
		{
			if (charArray[start] != charArray[end])
			{
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	public static void main(String args[])
	{
		palindrome p = new palindrome();
		
		if (p.isPalindrome("madam"))
		{
			System.out.println("The String is Palindrome");
		}
		else
		{
			System.out.println("The String is not Palindrome");
		}
	}
}