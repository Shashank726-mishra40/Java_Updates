
public class Main
{
	public static void main(String[] args) {
	B b  = new B() {};
	System.out.print(b.m1());
	}
}

interface A{
    default int m1(){
        return 10;
    }
    
}

interface B extends A{
    
}