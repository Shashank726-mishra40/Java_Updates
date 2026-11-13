
public class Main
{
	public static void main(String[] args) {
// 	B b = new A();  // incompatible types: A cannot be converted to B
// Parent [A] cannot be converted into child [B].
A b = new C();  // ye chal jaegaa [A] {Reference variable is of Parent type} 
	b.m1();
// 	b.m1(3);  // method m1 in class A cannot be applied to given types;
// Reference variable [A] jis class kaa hai function bhi vo usi class main search karegaa
// First call [A] par hogaa m1() ke liyee

//Agar method Override hua hai yani no. of parameters same hai too 
// 1st compiler Child ke pass jaegaa .
// If in child this method not avalible then go in Parent Class

	}
}
// Agar parent class main woo function hai too koi dikat hee nahi hai
class A{
    void m1(){
        System.out.println("1");
    }
}
class B extends A{
    // void m1(int a){
    // System.out.println("2");   
    // }
    
    // void m1(){
    // System.out.println("2");   
    // }
    
   
}

class C extends B{
   void m1(){
    System.out.println("45");   
    } 
}