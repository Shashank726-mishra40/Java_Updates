public class Main
{
	public static void main(String[] args) {
		Test c = new Test();  
		System.out.println(c.getA());
		System.out.println(c.getB());
	
	}
}

class A{
 int getA(){
     return 10;
 }  
}

interface B{
    int getB();
}


class Test extends A implements B{
    // extends first , then implements
    // because class interface koo implements kaa saktaa hai
    // implements first and then extends
    // too yaha par class interface koo extend nahi kar paegaa
  public int getB(){
      return 20;
  } 
}