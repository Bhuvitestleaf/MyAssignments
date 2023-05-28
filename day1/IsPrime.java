package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int n=13;
		for(int i=2;i<n-1;i++)
		if (i/n-1!=0)
		{
			System.out.println("It is a prime number");
			break;
		}else {
			System.out.println("It is not a prime number");
		break;
		}
	}

}
