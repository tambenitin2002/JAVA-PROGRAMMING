package patterns;

import java.util.Scanner;

/*
 
* * * * 
* *   * 
*   * * 
* * * * 

  
 */
public class P5 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		

		
		 int n=sc.nextInt();
		 for(int i=1;i<=n;i++) {
			
			 for(int j=1;j<=n;j++) {
				 if(i==j || i==1 || i==4 || j==1 || j==4) {
				 System.out.print("* ");
				 }else {
					 System.out.print("  "); 
				 }
				
			 }
			 System.out.println();
			}
		 }

}
