import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int a = sc.nextInt();
	 int b = sc.nextInt();
	long sum = 0;
	for(int j=a;j<=n;j++){
	    	long t = 0;
	    	int temp = j;
	    while(temp!=0){
	    t += temp%10;
	     temp /=10;
	}
	if(t>=a && t<=b) sum += j;
// 	else t = 0;
	}
	System.out.print(sum);
	}
}
