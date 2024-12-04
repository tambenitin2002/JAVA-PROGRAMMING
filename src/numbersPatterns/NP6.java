package numbersPatterns;

import java.util.Scanner;

public class NP6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the n: ");
		int n=sc.nextInt();	
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++){
				System.out.print(k+" ");
				k++;
				if(k==5) {
				  k=1;
				}
			}
         System.out.println();
	    }


	}
}
