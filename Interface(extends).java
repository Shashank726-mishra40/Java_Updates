
public class Main
{
	public static void main(String[] args) {
		C c = new Test();  
		System.out.println(c.getA());
		System.out.println(c.getB());
		System.out.println(new Test().getC());	
	}
}

interface A{
 int getA();   
}
interface B{
    int getB();
}

interface C extends A,B{   // Multiple interface extends by interface C 
                           // Multiple Inheritence
    int getC();
}

class Test implements C{
    public int getA(){return 12;}
     public int getB(){return 13;}
      public int getC(){return 15;}
}