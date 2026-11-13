
public class ConstructorKaaJaduu
{
	public static void main(String[] args) {
		C p = new C();

	}
}

class P{
    P(){
        IO.println(23);
    }
    
}

class C extends P{
//     Pehle parent class (P) ka constructor call hota hai
// Fir child class (C) ka constructor execute hota hai

// ismae ek keyword hide hota hai super.P() jo pahale parent class ke Constructoor ko call karata hai
   C(){
      IO.println(293);  
   }
   
}