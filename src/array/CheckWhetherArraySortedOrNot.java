package array;

public class CheckWhetherArraySortedOrNot {

	public static void main(String[] args) {
		int a[]= {5,29,19};
		boolean exit =true;
		for(int i=1;i<a.length;i++) {
			if(a[i]>a[i-1]) {
				
			}
			else {
				exit=false;
			}
		}
		if(exit) {
			System.out.println("Array is  Sorted");
		}else {
			System.out.println("Array is Not sorted");
		}

	}

}
