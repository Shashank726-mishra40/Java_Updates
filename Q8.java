import java.util.*;
public class Main
{
	public static void main(String[] args) {
	ArrayList<Product> arr = new ArrayList<>();
	arr.add(new Product(101,"Keyboard",2000,30));
	arr.add(new Product(102,"Headphone",700,12));
	arr.add(new Product(103,"Buds",1700,32));
	
    arr.remove(1);
    
    arr.get(0).quntity = 33;
	for(Product ele : arr){
	 ele.display(); 
	}
	
	
	}
}

class Product{
 int id;
 String pname;
 int price;
 int quntity;
 
 Product(int id,String pname,int price,int quntity){
     this.id=id;
     this.pname = pname;
     this.price = price;
     this.quntity = quntity;
 }
 
 void display(){
     System.out.println(id+" "+pname+" "+price+" "+quntity);
 }
}

