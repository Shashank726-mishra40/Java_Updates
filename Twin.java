import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0 ;
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		    sum += arr[i];
		}
		int c = 0;
		int sum1 = 0;
		Arrays.sort(arr);
		for(int j=n-1;j>=0;j--){
		 sum1 += arr[j];
		 c++;
		 if(sum1>(sum/2)){
		   break;  
		 }
		}
	System.out.println(c);	
	}
}
