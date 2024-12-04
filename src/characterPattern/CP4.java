package characterPattern;
/*
 
A B C D 
E F G H 
I J K L 
M N O P 

  
 */
import java.util.Scanner;

public class CP4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the n: ");
		int n=sc.nextInt();	
		int k=65;
		for(int i=65;i<=n;i++) {
			for(int j=65;j<=n;j++){
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


