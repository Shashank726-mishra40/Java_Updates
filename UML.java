import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Species sp = new Species();
	    sp.speciesName = "DOG";
	Pet p1 = new Pet();
	Pet p2 = new Pet("abc",19,sp); // too isilye yaa par ham (sp) joo object hai Species kaa usepass karenge 
	System.out.println("fjcn");
	}
}
class Species{
 String speciesName;   
}
class Pet{
    static int MIN_AGE=18;
    String name;
    int age;
    Species species;
     
     Pet(){}
         

     Pet(String name,int age,Species species){ // yaha par Species as a whole object hai
         
     }
     public void birthday(){
         
     }
     public int getInt(){
        return 0; 
     }
     public void adpot(String name){
         
     }
     public Species getSpecies(){
         return null;
     }
}
