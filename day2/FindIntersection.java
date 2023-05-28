package week2.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,15,16,20,34};
		int b[]= {12,18,21,15,9};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) { if(a[i]==b[j]) {System.out.println(b[j]);
			}
			}
		}
	}
}
