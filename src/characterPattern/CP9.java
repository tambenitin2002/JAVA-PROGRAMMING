package characterPattern;
/*
 
      a 
    b c 
  d e f 
g h i j 

  
 */
import java.util.Scanner;

public class CP9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the n: ");
		int n=sc.nextInt();	
		 int k=97;
		 for(int i=97;i<=n;i++) {
			
			 for(int j=97;j<=n;j++) {
				 if((i+j)>=n+97) {
				char a=(char)k;
				System.out.print(a+" ");
				k++;
				 }else {
					 System.out.print("  ");
				 }
			 }
			 System.out.println();
		 }

		}
}
