/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int number,count=0;
		Scanner s=new Scanner(System.in);
		number = s.nextInt();
		System.out.println("Enter a number:"+number);
 		if(number<0)
		{
			number=number * -1;
		}
		else if(number==0)
		{
			number=1;
		}
		while(number>0)
		{
			number=number/10;
			count++;
		}
			System.out.println("Number of Digits in given number is: "+count);
		// your code goes here
	}
}