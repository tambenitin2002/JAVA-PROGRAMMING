package numbers;

import java.util.Scanner;

public class SumOfAllFactor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		int sumOfFactor=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sumOfFactor=sumOfFactor+i;
			}
		}
		System.out.println("The Total Sum of factor: "+sumOfFactor);
		
	}

}
