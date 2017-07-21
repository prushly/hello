/* package whatever; // don't place package name! */

import java.util.Scanner;
import java.lang.*;
import java.io.*;
class Ideone
{	public static void main (String[] args) throws java.lang.Exception
	{   int a=0;
		int r=0;
		int s=0;
		int t;
		
	
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the number");
		a=ss.nextInt();
			t=a;
		while(a>0){
			r=a%10;
			a=a/10;
			s=s*10+r;
		}
		if(t==s){	System.out.println(t + " is a Palindrome");}
	else{System.out.println(t + " is not a palindrome");
	}
	}
}