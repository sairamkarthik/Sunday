/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int x;
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
x=s.nextInt();
if(x>0)
{
    System.out.println("This is a positive number");
}
else if(x==0)
{
    System.out.println("It is zero");
}
else 
{
    System.out.println("This is a negative number");
}	// your code goes here
	}
}