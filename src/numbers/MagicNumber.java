package numbers;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number: ");
		int num=sc.nextInt();
		int rem=0;
		
		while(num>9) {
			int sum=0;
		
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
	
		num=sum;
		
		
	}
		
		if(num==1) {
			System.out.println("The Number is Magic");
		}else {
			System.out.println("The Number is not magic");
		}
	}
}


