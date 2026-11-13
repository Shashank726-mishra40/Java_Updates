import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
	}
}

abstract class V{
    abstract double rent(double d);
     int id;
     String brand;
     double rate;
     
     
     V(int id , String brand,double rate){
         this.id = id;
         this.brand = brand;
         this.rate = rate;
        
     }
}

class Cars extends V{
    
   Cars(int id,String brand,double rate){
       super(id,brand,rate);
   } 
   
   @Override
   public double rent(double t){
      return rate*t*(0.8);
   }
}

class Bikes extends V{
    
    Bikes(int id,String brand,double rate){
       super(id,brand,rate);
       rent(time);
   } 
   
   @Override
   public double rent(double t){
      return rate*(0.65);
   }
    
}

class LV extends V{
    LV(int id,String brand,double rate){
       super(id,brand,rate);
       rent(time);
   } 
   
   @Override
   public double rent(double t){
      return rate*t*(0.8);
   }
}

class Customer{
    
}