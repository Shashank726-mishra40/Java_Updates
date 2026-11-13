import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	    while(t-->0){
	    int n = sc.nextInt();
	    int a =0,b=0,c=0;
	    for(int i=2;i*i<=n;i++){
	        if(n%i==0){
	            a = i;
	             n /= i;
	            break;
	        }
	    }
	   
	    for(int i=a+1;i*i<=n;i++){
	        if(n%i==0){
	            b = i;
	             c = n/i;
	            break;
	        }
	    }
	   
	    if(a!=b && b!=c && c!=a && a!=0 && b!=0 && c!=0) {
	        System.out.println("YES");
	        	System.out.print(a+" "+b+" "+c);
	        	System.out.println();
	    }
else  System.out.println("NO");
	}
	}
}
