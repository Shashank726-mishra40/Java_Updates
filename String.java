
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	   sc.nextLine();
	    while(t-->0){
	    String str = sc.nextLine();
	    
	    int n = str.length();
	   
	    if(n>10){
	         int c = n-2;
	    char a = str.charAt(0);
	     char b = str.charAt(n-1);
	     System.out.println(a+""+c+""+b);
	    
	    }
	    else{
	        System.out.println(str);
	    }
	}
	
	}
}
