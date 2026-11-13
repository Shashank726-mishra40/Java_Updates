
public class Main
{
	public static void main(String[] args) {
	Shap s1 = new Circle(12);
	System.out.println("Perimeter = " + s1.parimeter());
        System.out.println("Area = " + s1.area());

	}
}

abstract class Shap{
 abstract double parimeter();
 abstract double area();
}
class Circle extends Shap{
  double r;
  Circle(double r){
      this.r = r;
  }
 
  public double parimeter(){
      double p = 2*(3.14)*r;
      
      return p;
  }
  public double area(){
      double a =  3.14*r*r;
      return a;
  }
  
}