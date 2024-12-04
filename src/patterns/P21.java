

/*
      * 
    * * 
  * * * 
* * * * 
  * * * 
    * * 
      * 
 */
package patterns;

import java.util.Scanner;

public class P21 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
	
		for(int i=1;i<n*2;i++) {
			for(int j=n;j>=1;j--) {
				if( j>i  || j+i>n*2) {
				System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
			}
			
			System.out.println();
		}
	}

}
