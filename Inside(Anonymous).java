
public class Main
{
	public static void main(String[] args) {
	B b  = new B() {    // Aur yaha implmenting class kaa role ye anonymous class ko diyaa gaya hai
	  public int sum(int a,int b){  // yaha B kee liye implementing class anonymous class hai 
	      return a+b;      //  Object anonymous class ka banega
	  }  
	};
	// Internally is anonymous class kaa nam Main$1 hota hai topClass$(index) 
	// to yaha object (anonymous class) yani Main$1 kaa baegaa
	// after that constructor calling Main$1<init> 
	// and this constructor set the values of instance variables
	// class Main$1 implements B (andar yahi kaa ho raha hai)
	// B kaa implentation ke sence tabhi hogaa jab anonymous class bnegaa
	
	System.out.print(b.sum(12,12)); // anonymous class ka reference 'b' main ja raha hai
	}
}
@FunctionalInterface
interface B{    // Interface object ke depedency ke liye implmenting class pe depend karta hai
    int sum(int a , int b);
    static int pro(){
        return 12;
    }
    private void l(){
        
    }
}

