package numbers;

import java.util.Scanner;

public class AmicableNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number: ");
		int num1=sc.nextInt();
		System.out.println("Enetr the number: ");
		int num2=sc.nextInt();
        int sum=0;
		
		for(int i=1;i<num1;i++) {
			if(num1%i==0) {
				sum=sum+i;
			}
		}
          int sum1=0;
		
		for(int i=1;i<num2;i++) {
			if(num2%i==0) {
				sum1=sum1+i;
			}
		}
		System.out.println("----------------------------------------------------");
		System.out.println("num1: "+num1);
		System.out.println("sum: "+sum);
		System.out.println("num2: "+num2);
		System.out.println("sum1: "+sum1);
		System.out.println("----------------------------------------------------");

		if(sum==num2 && num1==sum1) {
			System.out.println("The Number is Amicable ");
		}else {
			System.out.println("The Number is not Amicable ");
		}
	}

}
