import java.util.*;
public class starpattern
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a;
    if(n%2==0){
         a = n/2;
    }
    else a = (n+1)/2;


    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
        if(j==i || j==n-i+1){
            System.out.print("*");
        }
        else {
           System.out.print(" "); 
        } 
        }
        System.out.print("\n");
    }      
	    
}
}

