import java.util.Scanner;
public class Ideone {

	public static void main (String[] args) throws java.lang.Exception
	{
		
		
	char alpha;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the alphabet");
		alpha=s.next().charAt(0);
		if((alpha>='a'&&alpha<='z')||(alpha>='A'&&alpha<='Z')){System.out.println("It is  an alphabet");}
		else{
			System.out.println("It is not an alphabet");
		}
		
		
		}
	}

