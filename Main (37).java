import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int c =0;
	  int a = sc.nextInt();
	  int b = sc.nextInt();
	  for(int i=a;i<=b;i++){
	   int temp = i;
	   int p = 0;
	   boolean v = false;
	    while(temp!=0){
	   int t = temp%10;
	   if(t==4 || t==7) {
	     v = true;
	     temp /= 10; 
	   }
	   
	    else if(t!=4 || t!=7){
	       v = false; 
	       break;
	       
	   }
	
	    }
	    if(v)
	    {p = i;  
	    if(p!=0)
	    c++;
		 System.out.print(p+" ");
	    }
	    
	    
		
	}
	if(c==0){
	     	 System.out.print(-1); 
	     	
	    }

}
}
