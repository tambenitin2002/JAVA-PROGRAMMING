package numbers;

import java.util.Scanner;

public class SumOfFirstAndLastDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int lastNumber=num%10;
		
		while(num>9) {
			num=num/10;
		}
		System.out.println("The First digit is: "+num);
		System.out.println("The last digit is :"+lastNumber);
		int sum=num+lastNumber;
		System.out.println("The sum of the First and last digit:"+sum);
	}

}
