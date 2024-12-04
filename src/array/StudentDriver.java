
package array;

public class StudentDriver {

	public static void main(String[] args) {
		Student st[]=new Student[5];
		
		st[0]=new Student("Rahul ",12);
		st[2]=new Student("Shruti ",16);
		st[4]=new Student("Rahul ",13);
		
		System.out.println(st[0]);
		System.out.println(st[1]);
		System.out.println(st[2]);
		System.out.println(st[3]);
		System.out.println(st[4]);

	}

}
