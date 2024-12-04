package array;

public class CheckWhetherArrayPalindromOrNot {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,4,3,2,1};
		int st=0;
		int end=a.length-1;
		boolean flag=true;
		for(int i=0;i<a.length;i++) {
			if(a[st]==a[end])
			{
				st++;
				end--;
			}else {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("Array is palindrome");
		}else {
			System.out.println("Array is not pallindrom");
			
		}
	}
	
}
