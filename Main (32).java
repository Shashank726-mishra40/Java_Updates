import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	  String s = sc.next();
	  char ch = sc.next().charAt(0);
	  
// 	  string s1 = s;
// for(int i=0;i<s.length();i++){
//     if(s.charAt(i)==ch) System.out.println(i);
// }	  
    //   String s1 = s.replace(ch,' ');
    //   System.out.println(s1);
//     Apple
// p
// A  le
// String s1;
for(int i=0;i<s.length();i++){
if(s.charAt(i)==ch) continue;
else System.out.print(s.charAt(i));
	
	}
}
}
