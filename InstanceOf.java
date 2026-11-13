
public class Main
{
	public static void main(String[] args) {
	IO.println(new A() instanceof A); // true
	IO.println(new A() instanceof B); // false // Child do not hold parent class
	IO.println(new B() instanceof A); // true
	IO.println(new B() instanceof B); // true
    // IO.println(new B() instanceof String); // Error
    IO.println(new A() instanceof Object);  // true
    IO.println(new B() instanceof Object); // true
    
    B b = new B();
     IO.println(b instanceof Object); // true
          IO.println(b instanceof A); // true
	}
}

class A{
    
}
class B extends A{
    
}