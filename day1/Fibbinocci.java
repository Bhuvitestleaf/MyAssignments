package week1.day1;
public class Fibbinocci {
	public static void main(String[] args) {
		int x=0;
		int y=1;
		int sum=0;
		System.out.println(x);
		System.out.println(y);
		for (int i=1; i<=11; i++)
		{
			sum=x+y;
		System.out.println(sum);
		x=y;
		y=sum;
		}
	}
}
