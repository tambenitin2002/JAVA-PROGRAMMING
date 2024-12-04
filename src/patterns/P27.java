package patterns;
/*

* * * * *         
  * * * * *       
    * * * * *     
      * * * * *   
        * * * * * 



 */

import java.util.Scanner;

public class P27 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n=sc.nextInt();
		for(int i=1 ;i<=n;i++) {
			for(int j=1;j<n*2;j++) {
				if(j-i<n && i<=j) {
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





