import java.util.*;
public class Count
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0){
	        int n = sc.nextInt();
	        int c = 0;
	        for(int i=1;i<=Math.sqrt(n);i++){
	           if(n%i==0) {
	               if(i==Math.sqrt(n)) c +=1;
	             else c += 2;  
	           } 
	        }
	        System.out.println(c);
	    }
	
	}
}
