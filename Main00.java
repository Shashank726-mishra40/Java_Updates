import java.util.*;
public class Main00
{
	public static void main(String[] args) {
	int[] arr = {1,4,2,5,4,3,9,5,6};
	int max = Integer.MIN_VALUE;
	int n = arr.length;
	for(int i=0;i<n;i++){
	    if(arr[i]>max){
	        max = arr[i];
	    }
	}
	int c = 0;
	for(int i=0;i<n;i++){
	    if(arr[i]<max) c++;
	}
	System.out.print(c);

	}
}
