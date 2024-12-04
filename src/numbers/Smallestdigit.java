package numbers;

import java.util.Scanner;

public class Smallestdigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		int rem=0;

		int small=num;
		while(num!=0) {
			rem=num%10;

			num=num/10;

			if(rem<small) {
				small=rem;
			}
			
		}
		System.out.println("The large digit is "+small);

	}

}
