import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Customer c1 = new Customer(101,"A","a121@gmail.com",-230);
	
	System.out.println("Subscription fee is :"+c1.getSubfee());
	}
}

class Customer{
    private int id;
    private String name;
    private String email;
    private int subfee;
    
   Customer(int id,String name,String email,int subfee){
       this.id = id;
       this.name = name;
       this.email = email;
       setSubfee(subfee,name);
   }
    
    void setSubfee(int fee, String name){
        this.name = name;
        this.subfee = fee;
        if(subfee<0) System.out.println("Invalid");
        else System.out.println(name + " has Valid Subscription");
    }
    
    int getSubfee(){
        if(subfee>0)
        return subfee;
        else return 0;
    }
}