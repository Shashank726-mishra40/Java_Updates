import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int[] arr = {8,4,1,9,-3,6,5};
	   int n = arr.length;
	   int minIndex;
	   for(int i=0;i<n-1;i++){
	       minIndex = i;
	   
	      for(int j=i+1;j<n;j++){
	           if(arr[j]<arr[minIndex]){
	               minIndex = j;
	           }
	      }
	          
	           int t = arr[i];
	           arr[i] = arr[minIndex];
	           arr[minIndex] = t;
	       
	   }
	   for(int j=0;j<n;j++){
	       System.out.print(arr[j]+" ");
	   }
	
	}
}
