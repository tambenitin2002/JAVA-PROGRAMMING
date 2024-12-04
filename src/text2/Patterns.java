package text2;

public class Patterns {
  public static void main(String[] args) {
	int n=3;
	for(int i=1;i<n*2;i++) {
		for(int j=1;j<n*2;j++){
			if(j%2!=0) {
			System.out.print(j+" ");
			}else {
				System.out.print("* ");
			}
		}
		System.out.println();
	}
}
}
