package week2.day2;
import java.util.Arrays;
public class FindDuplicateInArray {
	public static void main(String[] args) {
  int[] num= {5,40,10,5,25,40};
  Arrays.sort(num); 
  for(int i=0;i<num.length-1;i++) {      
	  for(int j=i+1;j<num.length;j++)
	if(num[i]==num[j]) { 
		System.out.println(num[i]); }
	 }
    }
}
