import java.util.Scanner;
public class Ideone {

	public static void main (String[] args) throws java.lang.Exception
	{int a;int b=1;
	Scanner ss=new Scanner(System.in);
	System.out.println("Enter the number");
	a=ss.nextInt();
	while(a>0){b=a*b;a--;}
	System.out.println("The factorial of the number is\n"+b);}}