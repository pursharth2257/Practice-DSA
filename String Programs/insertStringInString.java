// Java program to insert a string in an another string.

import java.lang.*;
import java.util.*;

public class insertStringInString
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter First String : ");
		String firstStr = input.nextLine();
		
		System.out.println("Enter Second String : ");
		String secondStr = input.nextLine();
		
		System.out.println("Enter the index to add : ");
		int index = input.nextInt();
		
		String newStr = firstStr.substring(0, index + 1) + secondStr + firstStr.substring(index + 1);
		
		System.out.println(newStr);
	}
}