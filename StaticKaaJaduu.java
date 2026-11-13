
public class Main
{
	public static void main(String[] args) {
	C.m1();
	IO.println(C.a);
	}
}

class P{
    static int a = 020;  // Static member participated  (Access Modifier Private naa hoo)
    static void m1(){
        IO.println(001);
    } 
}
class C extends P{
//   void m1(){
//       System.out.println("dddd"); // Error :- m1() in C cannot override m1() in P 
//     // on-static method m1() cannot be referenced from a static context
//   }
}