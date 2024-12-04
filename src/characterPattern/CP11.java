package characterPattern;
/*
 
a e i m 
b f j n 
c g k o 
d h l p
  
 */
import java.util.Scanner;

public class CP11 {
public static void main(String[] args) 
	
	{
		int n=4;
		char c='a';
		for(int i=1;i<=n;i++)
		{
			char ch = c;
			for(int j=1;j<=n;j++)
			{
				System.out.print(ch +" ");
				ch+= (char)n;
			}
			  System.out.println();
			c++;
		}
		
	}
}
