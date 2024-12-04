package numbers;

import java.util.Scanner;

public class LargestDIgitInNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		int rem=0;

		int larg=0;
		while(num!=0) {
			rem=num%10;

			num=num/10;

			if(rem>larg) {
				larg=rem;
			}
			
		}
		System.out.println("The large digit is "+larg);

	}

}
