import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   String s = "Shashank";
	   	System.out.println(s.charAt(0));
	int n = s.length();
		System.out.println(n);
		String str = "1234";
	System.out.println(s.indexOf('s'));
		System.out.println(s.concat(str));
System.out.println(s.replace('S','A'));
StringBuilder sb = new StringBuilder(s);
   sb.reverse();
   System.out.println("" +sb);

 	    
	}
}
