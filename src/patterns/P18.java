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

public class P18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		//int m=7;
		
		/*
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if( j>=i  || j+i>m) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}
		*/
		for(int i=1;i<n*2;i++) {
			for(int j=1;j<=n;j++) {
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
