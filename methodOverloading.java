
    class Demo{
        void disp(int y){
          int w = 4*y;
        System.out.println(w);
           
    }
    void disp(int a,int b){
        int p = 2*(a+b);
        System.out.println(p);
            
    }
    void disp(double  d,double e){
double par = 0.5*d*e;
        System.out.println(par);
            
    }
         
}
public class methodOverloading{
   public static void main(String[] args) {
    Demo d = new Demo();
    d.disp(5);
    d.disp(10,5);
    d.disp(12.3,89.5);
   } 
}
