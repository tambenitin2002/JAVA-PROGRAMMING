package numbersPatterns;

import java.util.Scanner;
/*
1 2 3 4 
  1 2 3 
    1 2 
      1 

 */
public class NP12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the n: ");
		int n=sc.nextInt();	
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++){
				if(j<i) {
					System.out.print("  ");
					
				}else {
					System.out.print((j - i + 1) + " ");
				}
		
			
			}
			System.out.println();
         
	    }
	}
}


