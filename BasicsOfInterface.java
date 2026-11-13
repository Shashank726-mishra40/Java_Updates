
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}

interface A{
//   A(); // Constructor not Allow
// int b; // Instance variable with no intialization not Allow
int b = 12;  // Compiler read it as  public static final int b = 12; (Like a constant)
void m1(); // Compiler read it as  public abstract void m1(); (Like a abstract method)
// And which class implemented by A give defination to this m1();

void m2();

//void m3(){ 
    //  interface abstract methods cannot have body
    
//     void m3(){   Maximum Abstraction Achive hoo raha hai interface ke case main 

//  Abstract class main Maximum Achive nahi hoo pata hai kyuki non-abstract method koo bhi

// Allow kardeta hai abstract class 
//}
  
}
// C is not abstract and does not override abstract method m2() in A



abstract class C implements A{ // Partially implemented
  public void m1(){ // attempting to assign weaker access privileges; was public
  // Compiler ne m1() ko public access modifier se set kar diya hai too abb ham 
  // Access modifier main public koo hee use karenge according to method Overriding rule it goes wrong
    //   Access modifier yaa too same hoo yaa strong hoo    
  }  
}


// Jo bhi class interface koo implements karegaa woo class responsible hogaa 
// interface ke sare method ke defination ke liye


class Q implements A{
    public void m1(){
        
    }
    public void m2(){
        
    }
    
    public void m3(){
        
    }
}