package numbersPatterns;
/*
 
1 * 2 * 3 
1 * 2 * 3 
1 * 2 * 3 
1 * 2 * 3 
1 * 2 * 3 

  
 */
import java.util.Scanner;

public class NP9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the n: ");
		int n=sc.nextInt();	
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++){
				if(j%2==0) {
					System.out.print("* ");
				}else if(j==1 ) {
					System.out.print("1 ");
				}else if(j==n) {
					System.out.print("3 ");
				}else {
					System.out.print("2 ");
				}
			}
         System.out.println();
	    }


	}

}
