package characterPattern;
/*
A B C D 
A B C D 
A B C D 
A B C D 
 
 */
import java.util.Scanner;

public class CP {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n: ");
		int n=sc.nextInt();
		
		 for(int i=65;i<=n;i++) {
			 for(int j=65;j<=n;j++) {
				char a=(char)j;
				System.out.print(a+" ");
			 }
			 System.out.println();
		 }
	}

}
