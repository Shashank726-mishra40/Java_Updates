
public class Main
{
	public static void main(String[] args) {
		A a = () -> 012%2;
		System.out.print(a.show());
	}
}

@FunctionalInterface
interface A{
 int show();
   
//   static int show(){
//       return 23;
//   }      // no abstract method found in interface A
    // int show2(); // multiple non-overriding abstract methods found in interface A
}