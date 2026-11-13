
public class Main
{
	public static void main(String[] args) {
	    int[] arr = {1,3,6,10};
	int n = arr.length;
	int total = 0;
	for(int i=0;i<n;i++){
	    total += arr[i]*(i+1)*(n-i);
	}
	System.out.println(total);
	}
}
