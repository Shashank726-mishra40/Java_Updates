
public class Main
{
	public static void main(String[] args) {
	B b = new B();
	System.out.println(b.y);
	}
}

class A{
    A(){
        IO.println(109);
    }
    static int x = 10;
    int y = f();
    int f(){
        return x+1;
    }
    
}
class B extends A{
    B(){
        IO.println(123);
        super();
        IO.println(19);
    }
    static int x = 5;
    int f(){
        return x+2;
    }
}