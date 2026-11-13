import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0){
		    int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			System.out.print(arr[i]+" ");
		}
		for(int l=1;l<n;l++){
     int i=0;
     int j=i+l;
    while(i<j && j<n){
         System.out.print(max(arr,i,j)+" "); 
         i++;
         j++;
    }
    
	}
	System.out.println();
	}
	}
	public static int max (int[] arr,int i, int j) {
	  int m = Integer.MIN_VALUE;
	  for(int k=i;k<=j;k++){
	      if(arr[k]>m){
	          m = arr[k];
	      }
	  }
	  return m;
	}
}
