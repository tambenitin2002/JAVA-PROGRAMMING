package array;

public class RevereseEachNumberr {

	public static void main(String[] args) {
		//Print the revers of each element of array
    	
		
		int a[]= {12,56,23,154,896,452};
		
		for(int i=0;i<a.length;i++) {
			int rev=0;
			while(a[i]!=0) {
				int rem=a[i]%10;
				rev=rev*10+rem;
				a[i]=a[i]/10;
			}
			a[i]=rev;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
