

public class functon {
    public static void main(String[] args) {
        Sayhello("Shashank");
        System.out.println(getNumber());
    }
    // Take something return nothing
    public static void Sayhello(String name) {
        System.out.println("Hello "+ name);
    }
    // Take nothing return somthing
    public static int getNumber() {
      return 10;  
    }
}

