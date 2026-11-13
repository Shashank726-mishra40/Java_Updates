import java.util.*;
public class Main
{
	public static void main(String[] args) throws Exception {
	m2();
	}
	static void m2(){
	    m3();
	}
	static void m3(){
	    m4();
	}
	static void m4(){
	   int t = 4/0;
	   System.out.print(t);
	}
	
}


// jab insab methods me se kisi ne bhi handle nahi kiyaa to kon handle kregaa 
//  default Exception handler (Part of JRE) 

// Matching handler nahi milaa isiliye default Exception handler chalegaa
// uske baad stack Trace print hogaa

// Error Message with class name 
// Exception in thread "main" java.lang.ArithmeticException: / by zero
// Stack Trace 
// at Main.m4(Main.java:14)
//         at Main.m3(Main.java:11)
//         at Main.m2(Main.java:8)
//         at Main.main(Main.java:5)

// then Program terminate ho jaegaa


