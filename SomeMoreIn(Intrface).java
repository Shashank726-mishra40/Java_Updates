public class Main
{
	public static void main(String[] args) {
		Test c = new FinalClass();  
		System.out.println(new FinalClass().getA());
		System.out.println(c.getB());
	
	}
}
interface B{
    int getB();
    int getA();
}
abstract class Test implements B{ // Partial implementation hoo raha hai
    public int getB(){       // Generally jab tak required naa hoo tab tak naaa kare
        return 12; 
    }
    
}

// Lekin inherite karte samaya yee partial implementation main jame ye bhi dhyann rakhan hai kee 
// kee parentClass abstrct hee taki agar ham usme sare methods joo interface main hai 
// voo define kar bhi sakte hai aur joo class bacch gaya use childClass main declare karne hai


// ChildClass abstract naa rahe nahi too ham uskaa object nahi baana paegne  

 class FinalClass extends Test{  // extends karne se ham Test class ke methods bhi use kar sakte hain
    public int getA(){    // aur agar ham interface ke sare methods koo FinalClass main define nahi 
    // bhi karte hain to bhi kaam hoojaegaa 
        return 123;
    }
}

 
