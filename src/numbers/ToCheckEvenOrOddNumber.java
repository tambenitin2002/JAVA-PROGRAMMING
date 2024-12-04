package numbers;

import java.util.Scanner;

public class ToCheckEvenOrOddNumber {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	while(num>9) {
		num=num%10;
	}
	if(num%2==0) {
		System.out.println("The Number is Even!");
	}else {
		System.out.println("The Number is Odd!");
	}
}
}
