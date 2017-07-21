import java.util.Scanner;
public class Ideone {

	public static void main (String[] args) throws java.lang.Exception
	{ int a=0;int b=0;
	Scanner ss=new Scanner(System.in);
	System.out.println("Enter the number");
	a=ss.nextInt();
	while(a>0){b=a+b;a--;}
		System.out.println(b);
	}}
	