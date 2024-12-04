package patterns;

/*

        * 
      * * 
    *   * 
  *     * 
*       * 
  *     * 
    *   * 
      * * 
        * 



 */

import java.util.Scanner;

public class P32 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int n=sc.nextInt();
		
		for(int i=1;i<n*2;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j==n+1 || j==n || i-j==n-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
