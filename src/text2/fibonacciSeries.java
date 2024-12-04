package text2;
import java.util.Scanner;
public class fibonacciSeries {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enetr the number: ");
			int num=sc.nextInt();
			int n1=0,n2=1,n3;
			int fib=0;
			for(int i=1;i<=num;++i) {
				
		
				System.out.print(n1+" , ");
				n3=n1+n2;
				n1=n2;
				n2=n3;
			}
			}
			
		}




