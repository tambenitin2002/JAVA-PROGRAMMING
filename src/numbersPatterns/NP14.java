package numbersPatterns;
/*
 
1       
2 1     
3 2 1   
4 3 2 1 

  
 */
import java.util.Scanner;

public class NP14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the n: ");
		int n=sc.nextInt();	
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=1;j--){
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
