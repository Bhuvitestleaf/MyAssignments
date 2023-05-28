package week2.day2;
import java.util.Arrays;
public class FindMaxMin 
{
	public static void main(String[] args) 
	{// TODO Auto-generated method stub
	int[] num = {2,5,7,7,5,9,2,3};
	                //Output is 2 & 9
	Arrays.sort(num);
	int l=num.length;
	System.out.println(num[0]);
	System.out.println(num[l-1]);
		}
	}