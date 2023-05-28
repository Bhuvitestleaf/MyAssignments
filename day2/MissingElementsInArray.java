package week2.day2;
import java.util.Arrays;
public class MissingElementsInArray {
	public static void main(String[] args) {
	int arr[]= {2,7,3,4,1,6};
    Arrays.sort(arr);   //1,2,3,4,__,6
    for(int i=0; i<arr.length;i++)
    { 
    		 if(arr[i]!=i+1)
    		 { System.out.println(i+1);
    		 break;
    		 } 
    		 }
    }
	}

