import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    byte t = sc.nextByte();
	    while(t-->0){
	        int n = sc.nextInt();
	        int bin = 0;
	        while(n>0){
	          int b = n%2;
	          bin = bin*10 + b;
	          n = n/2;
	        }
	        int sum = 0;
	        int rev = bin;
	       int i = 0;
	        while(bin>0){
	            int d = bin%10;
	            if(d==1){
	            sum += d*Math.pow(2,i);
	   i++;
	    bin = bin/10;
	        }
	       
	        
	        }
	        System.out.println(sum);
	    }
		
	}
}
