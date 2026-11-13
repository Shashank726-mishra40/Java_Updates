
public class Main
{
	public static void main(String[] args) {
		P p = new C();
		C c = (C) p;
	    c.m1();	
	    IO.print(c==p); // true
	   // p.m1(); // Error 
	}
}

class P{
    
}

class C extends P{
   void m1(){} 
}