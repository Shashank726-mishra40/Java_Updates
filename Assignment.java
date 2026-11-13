import java.lang.*;
import java.util.*;
class assignment
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 ArrayList<Integer>  ans = new ArrayList<>();
	 int n = sc.nextInt();
	 
	 int[] arr = new int[n];
	 for(int i=0;i<n;i++){
		 arr[i] = sc.nextInt();
	 }
	 int carry = 1;
for(int i=n-1;i>=0;i--){
if(arr[i]+carry<10){
	ans.add(arr[i]+carry);
	carry = 0;
}
else if(arr[i]+carry==10){
	int b = arr[i]/10;
	ans.add(b);
	carry = 1;
}


}
if(carry==1) ans.add(1);	
Collections.reverse(ans);
System.out.println(ans);	
}

    }


