import java.util.*;
public class Main
{
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int a = sc.nextInt();
	     int b = sc.nextInt();
	     divisor div = new divisor();
	    int d = div.remainder(a,b);
	  int e = div.quotient(a,b);
 System.out.println(e);
  System.out.println(d);
}
}
class divisor{
    public int remainder(int a,int b){
        return a%b;
    }
    public int quotient(int a,int b){
        return a/b;
    }
}