package numbersPatterns;
/*
4 3 2 1 
  4 3 2 
    4 3 
      4 

 */
import java.util.Scanner;

public class NP17 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the n: ");
		int n=sc.nextInt();	
		for(int i=1;i<=n;i++) {
			int k=n;
			for(int j=1;j<=n;j++){
				if(j>=i) {
					System.out.print(k+" ");
					k--;
					
				}else {
					System.out.print("  ");
					
				}
		
			
			}
			System.out.println();
         
	    }

	}

}
