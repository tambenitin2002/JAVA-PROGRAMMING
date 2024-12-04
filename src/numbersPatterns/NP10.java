package numbersPatterns;

import java.util.Scanner;

public class NP10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the n: ");
		int n=sc.nextInt();	
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++){
				if(j>=i && j%2==0) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
         System.out.println();
	    }


	}
}
