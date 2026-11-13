import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	   long n1 = sc.nextLong();
	    long n2 = sc.nextLong();
	     long n3 = sc.nextLong();
	      long n4 = sc.nextLong();
	long mul = 1;
 
        mul = (mul * n1) % 100;
        mul = (mul * n2) % 100;
        mul = (mul * n3) % 100;
        mul = (mul * n4) % 100;
 
	
	   long b = mul%10;
	   mul = mul/10;
	   long c = mul%10;
	   c = (c*10)+(b);
	    System.out.printf("%02d", c);
	  
	}
	
}
