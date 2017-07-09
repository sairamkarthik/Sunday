/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,c;
		int large;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		System.out.println("Enter first number:\n");
		
		b=s.nextInt();
		System.out.println("Enter second number:\n");
		
		c=s.nextInt();
		System.out.println("Enter third number:\n");
		if(a>b && a>c)
		{
			large=a;
			System.out.println("Largest number:\n"+large);
		
		}
		else if(b>a && b>c)
		{
			large=b;
			System.out.println("Largest number:\n"+large);
		}
		else
		{
			large=c;
			System.out.println("Largest number:\n"+large);
		}
		// your code goes here
	}
}