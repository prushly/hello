import java.util.Scanner;
public class Ideone {

	public static void main (String[] args) throws java.lang.Exception
	{ int n=0;
	int r=0;
	int t=0;
    Scanner ss=new Scanner(System.in);
	System.out.println("Enter the number :");
	n=ss.nextInt();
	System.out.println("Enter the power  99:");
	r=ss.nextInt();
	while(r>1) {
		t=n;
	while(r>1) {
		n=t*n;
		r--;
		}}
	System.out.println(n);
}}
	