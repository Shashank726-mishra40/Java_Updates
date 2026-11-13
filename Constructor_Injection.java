import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Engine en = new Engine(500);
	en.showPower();
	// Injecting Engine into Car
	Car c = new Car(en);
	c.show();
	}
}
// Strong  dependency  
class Engine{
    int power;
    Engine(int power){
        this.power = power;
    }
    void showPower(){
        IO.println(power);
    }
}

class Car{
    Engine en; // instance variable 
    // Constructor Injection 
    Car( Engine en){ // Independent class kaa parameter
       this.en = en;  // this.en represent ( dependent class kaa instance variable );
       // en reperesent the ( parameter of independent class ); 
    }
    void show(){
      en.showPower();  
    }
}