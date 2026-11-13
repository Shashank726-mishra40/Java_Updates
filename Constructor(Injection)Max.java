class NumberProvider {
    int getNumber() {
        return 100;
    }
}
class Display {
    // A reference variable is declared.
// This variable can store the address/reference of a NumberProvider class.

    private NumberProvider provider;
    
    // provider = null;
    
    // Dependency Injection through constructor
    Display(NumberProvider provider) {
        this.provider = provider;
    }
    // matlab provider main abb null kee jagaha NumberProvider class kaa object pass assign ho raha hai
    
    // The provider variable inside Display class, which was initially null,
    // now stores the reference of the NumberProvider object passed from main().
    
    void show() {
        System.out.println(provider.getNumber());
    }
}
public class Main {
    public static void main(String[] args) {
        
        NumberProvider np = new NumberProvider();
        // Inject dependency 
        Display d = new Display(np); // It receives a NumberProvider object from outside.
        // np is passed into the constructor
      //  Constructor parameter receives it
        d.show();
    }
}


/*
Dependency Injection means: Instead of a class creating an object itself, the object is provided (injected) from outside.
*/