package characterPattern;
/*
 
a b c d 
e f g h 
i j k l 
m n o p 

  
 */
import java.util.Scanner;

public class CP5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the n: ");
		int n=sc.nextInt();	
		int k=97;
		for(int i=97;i<=n;i++) {
			for(int j=97;j<=n;j++){
				if(k<9) {
					char a=(char)k;
				System.out.print(a+"  ");
				k++;
				}else {
					char a=(char)k;
					System.out.print(a+" ");
					k++;
				}
			}
         System.out.println();
	    }

		}

}
