package numbers;

import java.util.Scanner;

public class RangeOfPerfect {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num1=sc.nextInt();
		System.out.println("Enter the Number: ");
		int num2=sc.nextInt();
		for(int j=num1;j<=num2;j++) {
			int num=j;
		int sumOfFactor=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sumOfFactor=sumOfFactor+i;
			}
		}
//		System.out.println("The Total Sum of factor: "+sumOfFactor);
		if(num==sumOfFactor) {
			System.out.println(j);
		}
		}
	
	}

}
