import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    first:
// 	  Scanner sc = new Scanner(System.in);
	  for(int i=1;i<6;++i){
	   for(int j=1;j<5;++j){
	       if(i==3 || j==2)
	           continue first;
	           System.out.println(i+","+j);
	       
	   }   
	  }
	  
		
	}
}
