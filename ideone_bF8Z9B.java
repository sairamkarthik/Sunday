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
		System.out.println("Enter number:"+n);
		int count;
		int	x=0;
		for(count=0;count<=n;count++)
		{
			x=count+x;
		}
		System.out.println("Sum:"+x);
		// your code goes here
	}
}