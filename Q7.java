import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Exam e1 = new Exam(6);	
	utilityClass c1 = new utilityClass("abc University");
	}
}

class Exam{
   final int pmarks = 33;
   int marks;
   
   Exam(int marks){
       this.marks = marks;
       
       result(marks);
   }
   
  
  final void result(int marks){
     if(marks<pmarks){
          System.out.println("Fail"); 
         
     }
     else{
      System.out.println("Pass");
     
     } 
  } 
  
 
}

final class utilityClass{
    String uname;
     utilityClass(String uname){
         this.uname = uname;
   System.out.println(uname);   
  }
}
