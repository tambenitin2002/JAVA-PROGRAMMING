package numbers;

import java.util.Scanner;

public class BuzzNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num=sc.nextInt();
//		for(int i=1;i<=num;i++) {
//			
//		}
		int rem=num%10;
		if(num%7==0 || rem==7) {
			System.out.println("It is a Buzz Number");
		}else {
			System.out.println("It is Not buzz");
		}
		}

}
