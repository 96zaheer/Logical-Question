package interview.logical.question;
import java.util.Scanner;
public class PrimeNo {

	public static void main(String [] args) {
		
		int n, c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		n= sc.nextInt();
		
		for( int i=1; i<=n; i++)
		{
			if(n%i==0) 
			{
				c++;
			}
			if(c==3)
				break;
		}
			if(c==2) {
				System.out.println(n+" Prime");
			}
			else {
				System.out.println(n+" Not Prime");
			}
	}
}
