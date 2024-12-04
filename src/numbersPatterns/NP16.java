package numbersPatterns;

import java.util.Scanner;

public class NP16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the n: ");
		int n=sc.nextInt();
		for (int i = 1; i <= n; i++) {
            for (int j = 1; j <n*2; j++) {
                if (i+j<=n+1 && j-i<=n-1) {
                    if((i+j)%2==0) {
                    	System.out.print(" * ");
                    }else {
                    	System.out.print(i+" ");
                    }
                } else {
                    System.out.print("  "); 
                    
                }
            }
            System.out.println();
        }
		
//		for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n + i - 1; j++) {
//                if (j <= n - i) {
//                    System.out.print("  "); 
//                } else {
//                    System.out.print(i); 
//                    if (j < n + i - 1) {
//                        System.out.print(" * "); 
//                        j++; 
//                    }
//                }
//            }
//            System.out.println();
//        }
	}
}
