import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
		System.out.println("Hello World");
// 		Demo.display1();
Demo d = new Demo();
	}
}

class Demo{
    
    static int a = 10,b=20,c=30;
    static{
        System.out.println("Inside static block");
        a=100;
        b=200;
        c=300;
    }
   public static void display1 () {
      System.out.println("Inside static method");
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
   }
   int x = 40,y=50,z=60;
   {
       System.out.println("Inside non-static block");
       x = 45;
       y = 55;
       z = 65;
   }
   public void display(){
       System.out.println("Inside non-static method");
       System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(x);
      System.out.println(y);
      System.out.println(z);
   }
   public Demo(){
         System.out.println("Inside constructor");
         x = 400;
         y = 500;
         z = 500;
   }
   
}
// Demo d = new Demo();
// first --> static block --> non-static block --> constructor

// Demo.display1();
