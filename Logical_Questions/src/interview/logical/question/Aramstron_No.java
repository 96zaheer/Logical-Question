package interview.logical.question;
import java.util.Scanner;

public class Aramstron_No {

	public static void main(String[] args) {
		int n, r, sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		n=sc.nextInt();
		int temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		sc.close();
		System.out.println(temp == sum ? "Armstrong" : "Not");

	}

}
