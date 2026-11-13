import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   boolean flag = true;
	for(int i=2;i<=Math.sqrt(n);i++){
	    if(n%i==0){
	        flag = false;
	    }
	} 
	if(n==1) System.out.println("Neither Prime Nor Composite");
	else if(flag==false)System.out.println("Composite Number");
else System.out.println("Prime Number");	

}
}
