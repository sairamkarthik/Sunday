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
if(ch=='a' || ch=='A'|| ch=='e' || ch=='E' || ch=='I' || ch=='i' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
	{
		System.out.println("Vowel");
		}
		else
	{
		System.out.println("Consonant");
	}// your code goes here
	}
}