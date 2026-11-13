public class MethodOverLoading2 {
   public static void main(String[] args) {
    demo d = new demo();
d.disp(4,7);
d.disp(12,98,65);
d.disp(12.34,87.88);
    
   } 
}
class demo{
  void disp(int x,int y){
    int max = Math.max(x,y);
    System.out.println(max);
  }
  void disp(int a,int b,int c){
    int max = Math.max(a,Math.max(b,c));
    System.out.println(max);
  }

   void disp(double p,double q){
    double max = Math.max(p,q);
    System.out.println(max);
  }
}
