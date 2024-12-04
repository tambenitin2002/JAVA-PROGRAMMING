package numbers;

import java.util.Scanner;

public class AdditionOFEvenAndOddSum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int sumEven=0;
		int sumOdd=0;
		while(num!=0) {
			int rem=num%10;
			if(rem%2==0) {
				sumEven=sumEven+rem;
				
			}else {
				sumOdd=sumOdd+rem;
				
			}
			num=num/10;
			

		}
		System.out.println("The Sum Of The Odd Digit is: "+sumOdd);
		System.out.println("The Sum Of The Even Digit is: "+sumEven);
		}

}
