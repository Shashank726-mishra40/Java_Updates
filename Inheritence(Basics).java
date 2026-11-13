import java.util.*;
public class Main
{
	public static void main(String[] args) {
	B s = new B();
	s.m1();
	C s1= new C();
	s1.m2();
	}
}
// MULTILEVELED INHERITANCE

class A{      // A is child class of Object class
  int x = 012;  
//   private int  = 023;  Private member not access directly 
 protected int y = 023; // Jo class protected member wale class ko inherite karega vahi sirf 
 //us member ko use karegaa jaise is case main class B
 // B ---> Child class hai
 // C ---> Parent class hai
 int z = 98;
 
}

class B extends A{    // B  is child class of A
    void m1(){
        z = 22;
      System.out.println(x+y+z);   // yaha z = 22 hojaega
    }
}

class C extends B{     // C is child class of B
    void m2(){
        System.out.println(z); // yaha z = 98 hee hogaa
    }
}
