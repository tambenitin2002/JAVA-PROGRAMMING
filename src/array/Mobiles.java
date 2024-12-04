package array;

import java.util.Arrays;
import java.util.Scanner;

public class Mobiles implements Comparable {
	
	private static Mobiles[] m1;
	String comp;
	double price;
	String color;
	
	public Mobiles (String comp, double prive, String color) {
		this.comp= comp;
		this.price=price;
		this.color=color;
		
	}
	
	@Override
	public String toString() {
		return "Mobile [ comp " + " comp "+ " price " + price + " color " + color;
	}
	
	@Override
	public boolean equals(Object o)
	{
		Mobiles m1= (Mobiles) o;
		return this.comp.equals(m1.comp);
	}
	@Override
	public int compareTo(Object p)
	{
		Mobiles m1= (Mobiles) p;
		return this.comp.compareTo(m1.comp);
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size=sc.nextInt();		
		Mobiles a[]= new Mobiles[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the mobile company");
			String com=sc.next();
			System.out.println("Enter the mobile price");
			double pri=sc.nextDouble();
			System.out.println("Enter the mobile color");
			String col=sc.next();
			a[i]=new Mobiles(com,pri,col);
		
			
			//write a java program to create arreay an initiazie value thrue scanner
			//write a java program to create arreay an sumation all the element
			//print a java program to create arreay an sumation of odd
			//print a java program to create arreay an sumation of even
			//print a java program to create arreay an sumation of avrg
			//print a java program to create arreay an sumation of avrg of even index element
			//print a java program to create arreay an sumation of avrg of odd index element
		}
		
		for(int i=0;i<size;i++) {
			System.out.println(m1[i]);
			System.out.println("--------------------------------");
		}
		
		Arrays.sort(m1);
		
		
	}
	

}
