
public class Main
{
	public static void main(String[] args) {
		A a = new B();
		
	}
}

class A{
    static{System.out.print(1);}
    static int a = m1();
    static int m1(){
        System.out.print(2);
        return 010;
    }
    
}
class B extends A{
  static{System.out.print(3);}
    static int a = m1();
    static int m1(){
        System.out.print(4);
        return 012;
    }
    
} // 1234  
// 1st static block 
// aur phir a koo assigne karnaa thaa too m1() koo bhi call hogaa