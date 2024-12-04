package characterPattern;

import java.util.Scanner;
/*
 
a b c d 
  b c d 
    c d 
      d 

  
 */
public class CP8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the n: ");
		int n=sc.nextInt();	

		 for(int i=97;i<=n;i++) {
			 for(int j=97;j<=n;j++) {
				 if(j>=i) {
				char a=(char)j;
				System.out.print(a+" ");
				 }else {
					 System.out.print("  ");
				 }
			 }
			 System.out.println();
		 }

		}
}
