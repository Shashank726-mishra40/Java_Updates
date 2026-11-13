
public class Main
{
	public static void main(String[] args) {
	  
	}
}

abstract class A{
    
    // Agar Compiler A ke object koo allow kar degaa aur ham new A().m1() koo call kar denge to m1()
    // main chalegaa kya uskaa to body hee concrete class main dafine hain
    
    
    abstract void m1();  //  Declear m1() , not define m1() 
    abstract void m1(int a);
    abstract void m2(int a);
    void m3(){
        
    }
    // void m1(){      //   error: method m1() is already defined in class A
    //  // m1() declear only , not define 
    // // but compiler say this because in symbole table contain entry of m1() 
        
    // }

}
class B extends A{
    
    void m1(){     // Method Overriding and giving defination to abstraact class in Parent class
        
    }
    
    void m1(int x){  //Method Overloading also happens
        
    }
    void m2(int y){
        
    }
  }
  
  abstract class C extends A{  //  abstract class ke upper koi responsibility nahi hai 
  // abstract method ko define karne kee
  // but if you want you can also provide defination
      
  }