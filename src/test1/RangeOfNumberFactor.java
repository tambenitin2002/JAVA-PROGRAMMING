package test1;

import java.util.Scanner;

public class RangeOfNumberFactor {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter First Number: ");
		int m=sc.nextInt();
		System.out.println("Enter First Number: ");
		int n=sc.nextInt();
		for(int j=m;j<=n;j++) {
			int fact=1;
		
		for(int i=1;i<=j;i++) {
			fact=fact*i;	
		}
		System.out.println(fact);
		}
		
		
}
}
