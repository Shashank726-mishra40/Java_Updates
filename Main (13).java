import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	   long n1 = sc.nextLong();
	    long n2 = sc.nextLong();
	     long n3 = sc.nextLong();
	      long n4 = sc.nextLong();
	 long mul = n1*n2*n3*n4;
	
	   long b = mul%10;
	   mul = mul/10;
	   long c = mul%10;
	   c = (c*10)+(b);
	    System.out.println(c);
	}
	
}
//Difference = -10