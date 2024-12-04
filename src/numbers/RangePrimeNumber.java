package numbers;

import java.util.Scanner;

public class RangePrimeNumber {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The Number: ");
			int num=sc.nextInt();
			System.out.println("Enter The Number: ");
			int num1=sc.nextInt();
			for(int j=num;j<=num1;j++) {
			int count=0;
			for(int i=2;i<j;i++) {
				if(j%i==0) {
					count++;
				}	
			}
			if(count==0) {
				System.out.println(j);
			}
			}
		}

	}



