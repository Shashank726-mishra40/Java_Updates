// import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Customer c1 = new Customer("A",new Prepaid(300));
	Customer c2 = new Customer("b",new Postpaid(500));
	Customer c3 = new Customer("PW",new Postpaid(1500));
	
	c1.printBill();
	}
}

abstract class Plan{
  abstract double generatebill();  
}

class Prepaid extends Plan{
  double rechargeAmount;
  Prepaid(double rechargeAmount){
      this.rechargeAmount = rechargeAmount;
  }
  @Override
  public double generatebill(){
      return rechargeAmount;
  }
}

class Postpaid extends Plan{
    double userAmount;
    Postpaid(double userAmount){
        this.userAmount = userAmount;
    }
    
    @Override
    public double generatebill(){
        return userAmount;
    }
    
}

class Corporate extends Plan{
    double Amount;
    double discount;
    Corporate(double Amount){
        this.Amount = Amount;
        this.discount = discount;
    }
    
    @Override
    public double generatebill(){
        return Amount-discount;
    }
    
}

class Customer{
    String name;
    Plan plan;
    
    Customer(String name , Plan plan){
      this.name = name;
      this.plan = plan;
    }
    
    public void printBill(){
      System.out.println(name+" "+plan.generatebill()) ;
    }
}