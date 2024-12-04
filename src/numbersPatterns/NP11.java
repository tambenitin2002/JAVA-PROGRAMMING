package numbersPatterns;
/*
 
1 2 3 4 
2 3 4 
3 4 
4 

  
 */
import java.util.Scanner;

public class NP11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the n: ");
		int n=sc.nextInt();	
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++){
			if(j-i<=n-1 && i<=j) {
				System.out.print(j+" ");
				
			}else {
				System.out.print("");
			}
		
        
	    }
			 System.out.println();
	}

	}
}
