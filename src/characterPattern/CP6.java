package characterPattern;
/*
  
A       
B C     
D E F   
G H I J 

  
 */
import java.util.Scanner;

public class CP6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the n: ");
		int n=sc.nextInt();	
		int k=65;
		for(int i=65;i<=n;i++) {
			for(int j=65;j<=n;j++) {
				if(j==65||i==n|| j<=i  ) {
			    char a=(char)k;
				System.out.print(a+" ");
				k++;
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		}
}
