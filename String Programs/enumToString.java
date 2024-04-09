// Java program to convert enum to a string.

import java.io.*;

enum Fruits {
	Orange,
	Apple, 
	Banana,
	Grapes;
	}

public class enumToString
{
	public static void main(String args[])
	{
		System.out.println(Fruits.Orange.toString());
		System.out.println(Fruits.Apple.toString());
		System.out.println(Fruits.Banana.toString());
		System.out.println(Fruits.Grapes.toString());
	}
}