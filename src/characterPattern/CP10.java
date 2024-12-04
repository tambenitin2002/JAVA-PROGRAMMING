package characterPattern;

import java.util.Scanner;

public class CP10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the n: ");
		int n=sc.nextInt();	
		for(int i=97;i<n*98;i++) {
			
			
			for(int j=97;j<=n;j++) {
			//	if(j <= n - i+1  || j >= m - (n-i )) {
				if(i+j<n+97|| j-i>n-97) {
				System.out.print("  ");
				}
				else {
					char a=(char)i;
					System.out.print(a+" ");
				}
			}
			
			System.out.println();
		}


		}
}
