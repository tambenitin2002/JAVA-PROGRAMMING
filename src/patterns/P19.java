package patterns;
/*
* * * * 
* * *   
* *     
*       
* *     
* * *   
* * * *  
 */

import java.util.Scanner;

public class P19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		//int m=7;
		for(int i=1;i<n*2;i++) {
			for(int j=n;j>=1;j--) {
				//for(int j=1;j<=n;j++
				//if(i+j=n+1 || i-j=n-1
				
				if( j>=i  || j+i>=n*2) {
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
