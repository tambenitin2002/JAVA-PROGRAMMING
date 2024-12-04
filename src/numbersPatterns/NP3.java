package numbersPatterns;
/*
1 0 1 0 
1 0 1 0 
1 0 1 0 
1 0 1 0 


 */
import java.util.Scanner;

public class NP3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the n: ");
		int n=sc.nextInt();	
		for(int i=1;i<=n;i++) {
			int k=1;
			for(int j=1;j<=n;j++){
				System.out.print(k+" ");
			    if(k==1) {
			    	k--;
			    }else {
			    	k++;
			    }
			}
		
         System.out.println();
	    }
	}

}
