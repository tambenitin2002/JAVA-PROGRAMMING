package characterPattern;
/*
 
A A A A 
B B B B 
C C C C 
D D D D 

  
 */
import java.util.Scanner;

public class CP3 {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the n: ");
	int n=sc.nextInt();
	for (int i = 65; i <= n; i++) {
        for (int j = 65; j <= n ; j++) {
        	char a=(char)i;
            System.out.print(a+" ");
        }
        System.out.println();
    }	
 }
}
