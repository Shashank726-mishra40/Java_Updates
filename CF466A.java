import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
			int a = sc.nextInt();
		int c = 0 ;
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		  if(arr[i]<=a){
		      c++;
		  } 
		  else{
		      c = c+2;
		  }
		}
	System.out.println(c);	
	}
}
