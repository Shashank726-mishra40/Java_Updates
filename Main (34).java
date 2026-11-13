import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Dog d1 = new Dog();
	    Dog d2 = new Dog();
	     Dog d3 = new Dog();
	      Dog d4 = new Dog();
	System.out.println(Dog.count);
	}
}
class Dog{
    String breed;
    float price;
    int age;
    static int count;
    {
        ++count;
    }
    
}