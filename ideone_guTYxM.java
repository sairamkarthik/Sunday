/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println("Enter year:"+n);
		if(n>1000)
		{if(n%4==0 && n%100!=0 || n%400==0 && n%100!=0)
		{
			System.out.println("Leap year");	// your code goes here
		}
		else
		{
			System.out.println("Non-leap year");	// your code goes here
		}
		}
		else
		{
			System.out.println("Error");	
		}
	}
}