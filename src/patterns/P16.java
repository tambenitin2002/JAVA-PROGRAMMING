/*
* * * * * * * 
* * *   * * * 
* *       * * 
*           * 
 
 */

package patterns;

import java.util.Scanner;

public class P16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
	//	int m=7;
		for(int i=1;i<=n;i++) {
			
		//	for(int j=m;j>=1;j--) {
			for(int j=1;j<n*2;j++) {
			//	if(j <= n - i+1  || j >= m - (n-i )) {
				if(i+j<=n+1|| j-i>=n-1) {
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
