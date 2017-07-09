/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int b,p;
		Scanner s=new Scanner(System.in);
		b=s.nextInt();
		System.out.println("Enter base:"+b);
		p=s.nextInt();
		System.out.println("Enter power:"+p);
		int x=1;
		while(p!=0)
		{
			x*=b;
			--p;
		}
		System.out.println("Result:"+x);// your code goes here
	}
}