
public class Main
{
	public static void main(String[] args) {
// 	IO.println(new A() instanceof A); // true
// 	IO.println(new A() instanceof B); // false // Child do not hold parent class
// 	IO.println(new B() instanceof A); // true
// 	IO.println(new B() instanceof B); // true
//     // IO.println(new B() instanceof String); // Error
//     IO.println(new A() instanceof Object);  // true
//     IO.println(new B() instanceof Object); // true
    
//     B b = new B();
//      IO.println(b instanceof Object); // true
//           IO.println(b instanceof A); // true
// int a = 1234;
Object a = Integer.valueOf(10);
          IO.println(a instanceof Integer); // true;
          // error: primitive patterns are a preview feature and are disabled by default.
         // IO.println(a instanceof Integer);
                     //^
  
	}
}

class A{
    
}
class B extends A{
    
}