
public class Main
{
	public static void main(String[] args) {
	A a = new B();
	System.out.print(A.m2());
	System.out.print(a.m3());
	}
}


interface A{
  private void m1(){  // Private and Static method with declaration is allow in interface
     // But  Private too interface ke bahar access hee nahi hogaa to ham ise redecleare bhi nahi\
     // kar sakte hain 
     
  }
  static int m2(){  
      
      return 1233;
     
  }
   // default method koo redecleare kar saktee hain 
  default int m3(){
       m1();
      return 999;
      
  }
}

class B implements A{
//   static int m2(){  // ham static method ko redecleare nahi kar sakte hain 
//       return 234;
//   }

}