package array;

public class CopyArray extends OriginalArr {

	public static void main(String[] args) {
		
		int a[]= {4,7,2,9,3};
		int b[]=new int [a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		 
	}

}
