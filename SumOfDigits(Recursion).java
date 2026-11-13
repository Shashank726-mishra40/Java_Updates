import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    byte t = sc.nextByte();
	    while(t-->0){
	     int n = sc.nextInt();
 if(sumof(n)>9){
	   int m = sumof(n) ;
	   System.out.println(sumof(m));
	}
	    }
		
}
public static int sumof (int n) {
    int sum = 0;
   while(n>0){
     sum += n%10;
     n /= 10;
   }
   return sum;
}
    
}
