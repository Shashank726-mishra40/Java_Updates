public class ReturnType {
    public static int hello() {
       System.out.println("Apple"); 
       System.out.println("Banana");
       return 22;
    }
    public static void main(String[] args) {
        hello(); // yaha sirf call lagega return value print nahi hoga
        System.out.println("_______");
        int x = hello(); // yaha par return value bhi print hoga
        System.out.println(x+"9");
            System.out.println(x+9);
        
    }
    
}
