import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  MainGate g1 = MainGate.getInstance();  
		MainGate g2 = MainGate.getInstance(); 
	}
}
class MainGate{
    private static MainGate instance ;
    int c = 0;
    private MainGate(){
    System.out.println("New Connection");
    c++;
    display();
    }
    void display(){
      System.out.println(c);  
    }
    
    public static MainGate getInstance(){
        if(instance == null){
            instance = new MainGate();
        }
            return instance;
        }
    
}
