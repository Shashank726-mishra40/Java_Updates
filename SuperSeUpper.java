
public class Main
{
	public static void main(String[] args) {
	B b1 = new B();
	b1.m1();
	}
}

class A{
    int x = 34;
   void m1(){
        IO.println("2");
    }
}

class B extends A{
    // int x = 35;
   
    void m1(){
        IO.println("1");
    System.out.println(this.x); // Instence variable 
    // if class B main x nahi hai to woo this.x kaa use karne par Class A kaa X access kae legaa
    //Using super we can only access Instence variable and 
    
    
    
      System.out.println(super.x); // static Instence variable or Instence variable of Parent Class 
      
      
       super.m1(); // this is also allow
    }
}