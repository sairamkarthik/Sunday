/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
						char ch;
Scanner s=new Scanner(System.in);
System.out.println("Enter a character");
ch=s.next().charAt(0);
if('a'<=ch && ch<='z' || 'A'<=ch && ch<='Z')
	{
		System.out.println("Alphabet");
		}
		else
	{
		System.out.println("Not an alphabet");
}// your code goes here
	}
}