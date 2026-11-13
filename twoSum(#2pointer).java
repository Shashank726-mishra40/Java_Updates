import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int[] arr = {8,4,1,9,-3,6,5};
	   int n = arr.length;
	  int t = 10;
	  int i=0,j=n-1;
	  Arrays.sort(arr);
while(i<j){
    if(arr[i]+arr[j]>t) j--;
    else if(arr[i]+arr[j]<t) i++;
    else if(arr[i]+arr[j]==t){
        System.out.println(arr[i]+" "+arr[j]);
        break;
    } 
}
	   }
	
	}

