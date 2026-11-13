import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   N n = new N();
	   P p = new P();
	   p.print(n);
		
	}
}

class N{
    int value = 10;
}

class P{
    // N n;      // Association (HAS-A) // Strong RelationShip
    // public P(N n){
    //     this.n = n;
    // }
    
    void print(N n){   // Weaker Relation 
        IO.print(n.value); // 10
        // IO.print(n);
    }
}