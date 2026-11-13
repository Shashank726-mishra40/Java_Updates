import java.util.*;
public class Main {
	public static void main(String[] args) {

		Dog d = new Dog("BullDog",4.5f,9000); // Constructor Overloading
		Dog obj = new Dog(7,"hii");
		Dog obj2 = new Dog();

		System.out.println(d.getBreed());
		System.out.println(d.getAge());
		System.out.println(d.getPrice());
	}
}

class Dog {
	private String breed;
	private float age;
	private int price;
	public Dog( String breed,float age,int price) {
		this.breed = breed;
		this.age = age;
		this.price = price;
	}
	public Dog(int a,String b) {
		System.out.println(a);
		System.out.println(b);

		this("SHASHANK");    // Constructor Chaining
		
	}
	public Dog() {
		System.out.println("Hello World");

	}

	private Dog(String d) {
		System.out.println(d);
	}
	// Getters
	public String getBreed() {
		return breed;
	}

	public float getAge() {
		return age;
	}

	public int getPrice() {
		return price;
	}
}