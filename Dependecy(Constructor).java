class NumberProvider {
    int getNumber() {
        return 100;
    }
}
class Display {
    private NumberProvider provider;
    // Dependency Injection through constructor
    Display(NumberProvider provider) {
        this.provider = provider;
         System.out.println(provider.getNumber());
    }
    // void show() {
    //     System.out.println(provider.getNumber());
    // }
}
public class Main {
    public static void main(String[] args) {
        NumberProvider np = new NumberProvider();
        // Inject dependency
        Display d = new Display(np);
        // d.show();
    }
}


/*
Dependency Injection means: Instead of a class creating an object itself, the object is provided (injected) from outside.
*/