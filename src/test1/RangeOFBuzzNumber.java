package test1;

import java.util.Scanner;

public class RangeOFBuzzNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num=sc.nextInt();
		System.out.println("Enter The Number: ");
		int num1=sc.nextInt();
		for(int i=num;i<=num1;i++) {
			
		int rem=i%10;
		if(i%7==0 || rem==7) {
			System.out.println(i);
		}
		}
	}

}
