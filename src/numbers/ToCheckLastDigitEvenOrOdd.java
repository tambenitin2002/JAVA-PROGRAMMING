package numbers;

import java.util.Scanner;

public class ToCheckLastDigitEvenOrOdd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num =sc.nextInt();
	int lastNumber=num%10;
	if(lastNumber%2==0) {
		System.out.println("The Number is Even!");
	}else {
		System.out.println("The Number is odd!");
	}
}
}
