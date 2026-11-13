
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	   sc.nextLine();
	   int a=0;
	    while(t-->0){
	    int[] arr = new int[3];
	       int c = 0;
	    for(int j=0;j<3;j++){
	         arr[j] = sc.nextInt();
	        if(arr[j]==1){
	            c++;
	        }
	    }
	    if(c>=2) a++;
	}
	System.out.println(a);
	}
}
