package test1;

import java.util.Scanner;

public class RangeOfReverseNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first Number: ");
		int num1=sc.nextInt();
		System.out.println("Enter the last Number: ");
		int num2=sc.nextInt();
		
		for(int i=num1;i<=num2;i++) {
		int num=i;
		int rev=0;
		
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
	}
	}
	

}
