import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while(t-->0){
	  String s = sc.next();
	  int n = s.length();
	  int sum = 0;
	  for(int i=n-1;i>=0;i--){
	    char a =  s.charAt(i) ; 
	    
	    System.out.print(a+" ");
	 
	  }
	     System.out.println();
	 
	}
}
    
}
