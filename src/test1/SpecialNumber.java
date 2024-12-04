//To check a number is special or not ex no-59 5+9=14 and 5*9=45 14+45=59
package test1;

import java.util.Scanner;

public class SpecialNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		int numCopy=num;
		int rem=0;
		int sum =0;
		int mul=1;
		
		while(num!=0) {
			rem=num%10;
			sum=sum+rem;
			mul=mul*rem;
			num=num/10;
		}
		int add=sum+mul;
		if(add==numCopy) {
			System.out.println("The Number is Special");
		}
		else
		{
			System.out.println("The Number is not Special");
		}
	}
	

}
