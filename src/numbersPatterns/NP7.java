package numbersPatterns;
/*
 
1 5 9 13 
2 6 10 14 
3 7 11 15 
4 8 12 16 

  
 */
import java.util.Scanner;

public class NP7 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the n: ");
		int n=sc.nextInt();	
		
		for(int i=1;i<=n;i++) {
			int k=i;
			for(int j=1;j<=n;j++){
			System.out.print(k+" ");
			k=k+n;
			}
         System.out.println();
	    }
	}
}
