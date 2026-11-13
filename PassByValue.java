public class PassByValue {
    private int d;
    public  static void change(int x){

        x = 10; // aur ye x alag location par hai
    }
  
    private static void main(String[] args) {
        int x = 6; // ye x alag location par hai
        System.out.println(x);
        change(x); // yaha par ham x kee current value koo pass kar rahe hai.
        System.out.println(x);
    }
}
