import java.util.*;
public class Triplet
{
	public static void main(String[] args) {
	  char[] arr = {'b','c','a','b','b','a','a','d','b','a','b'};
	  int ca = 0;
	  int cla = 0;
	  for(int i=0;i<arr.length;i++){
	      if(arr[i]=='a') ca++;
	  }
	  int t = 0;
	  for(int i=0;i<arr.length;i++){
	      if(arr[i]=='a') cla++;
	      else if(arr[i]=='b'){
	       int cra = ca-cla;
	       t += (cla*cra);
	      }
	  }
	  
	  System.out.println(t); 
	 
	  
	
	}
}
