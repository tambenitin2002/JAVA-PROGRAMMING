package patterns;

public class StarNumberPattern {
	public static void main(String[] args) {
		
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j==n) {
					System.out.print(j);
				}
				if(i+j<n) {
					System.out.print("* ");
					
				}else {
					System.out.print("  ");
				}
				
				
			}
			System.out.println();
		}
	}

}
