package patterns;

import java.util.Scanner;

public class P38 {
 public static void main(String[] args) {
	

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the n value: ");
	int n=sc.nextInt();
	for(int i=1;i<n*2;i++) {
		for(int j=1;j<n*2;j++) {
			if( i==n || j==n || i<=n && j==1 || j>=n && i==1 || i>=n && j==(n*2)-1 || j<=n && i==(n*2)-1) {
				System.out.print("* ");
			}
			else {
				System.out.print("  "); 
			}
		}
		System.out.println();
			
	}
 }
}
