package test1;

import java.util.Scanner;

public class MPowerN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the m number: ");
		int m=sc.nextInt();
		System.out.println("Enter the n number: ");
		int n=sc.nextInt();
		int prod=1;
		for(int i=1;i<=n;i++) {
			prod=prod*m;
		}
		System.out.println("The "+m+" Power "+n+" is :"+prod);
	}

}
