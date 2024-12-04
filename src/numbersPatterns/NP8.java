package numbersPatterns;
/*
 
1 0 1 0 
1 0 1 0 
1 0 1 0 
1 0 1 0 

  
 */
import java.util.Scanner;

public class NP8 {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the n: ");
		int n=sc.nextInt();	
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++){
				if(j%2==0) {
				 System.out.print("0 ");
				}else{
					System.out.print("1 ");
				}
			}
        System.out.println();
	    }

}
}
