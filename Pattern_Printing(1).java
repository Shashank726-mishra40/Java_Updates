import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    char ch = 'a';
	    char ch1 = 'A';
	   for(int i=0;i<=3;i++){
	       for(int j=0;j<=3;j++)
	       if(i%2!=0){
	           System.out.print((char)(ch+i)); 
	           //System.out.print("\n");
	       }
	       else{
	          System.out.print((char)(ch1+i)); 
	           
	       }
	        System.out.print("\n");
	      
	       
	   }
	    
}
}
