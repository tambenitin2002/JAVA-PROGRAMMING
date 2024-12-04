package numbers;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num= sc.nextInt();
		int sqr=num*num;
		int rem=0;
		int sum=0;
		while(sqr!=0) {
			rem=sqr%10;
			sum=sum+rem;
			sqr=sqr/10;
		}
		if(num==sum) {
			System.out.println("The Number is Neon!1");
		}else {
			System.out.println("The Number is not Neon!");
		}

	}

}
