import java.util.Scanner;
public class Ideone {

	public static void main (String[] args) throws java.lang.Exception
	{
		
		
	char in;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the alphabet");
		in=s.next().charAt(0);
		if((in=='a')||(in=='e')||(in=='i')||(in=='o')||(in=='u'))
				{System.out.println("It is a vowel letter");}
		else{
			System.out.println("It is a consonant");
		}
		
		
		}
	}
