package patterns;
/*

* * * * 
  *     
    *   
* * * * 



 */

public class P3 {
	public static void main(String[] args) {
		 int n=4;
		 for(int i=1;i<=n;i++) {
			
			 for(int j=1;j<=n;j++) {
				 if( i==1 || i==4 || i==j) {
				 System.out.print("* ");
				 }else {
					 System.out.print("  "); 
				 }
				
			 }
			 System.out.println();
			}
		 }

}
