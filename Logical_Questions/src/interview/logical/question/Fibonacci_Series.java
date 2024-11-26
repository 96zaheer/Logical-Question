package interview.logical.question;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int k,a=1, b=1;
		 k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		System.out.print("1 1 ");
		
		while(k<n)
		{
			k=a+b;
			System.out.print(k+" ");
			a=b;
			b=k;
		}sc.close();
		

	}

}
