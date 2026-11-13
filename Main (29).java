import java.util.*;

public class Main {
    public static void main(String[] args) {

        Dog d1 = new Dog("BullDog",4.5f,90000);
         Dog d2 = new Dog("PUG",6.5f,70000);
         Dog d3 = new Dog("Husky",3.5f,20000);
        
        System.out.println(d1.getBreed());
        System.out.println(d3.getBreed());
          System.out.println(d1.getPrice()); // Last updated value sare price main fit ho jaegaa Static KeyWord kaa use karne se
        System.out.println(d3.getPrice());// Static variable whole class ko belong karegaa
        // System.out.println(d.getPrice());
    }
}

class Dog {
    private String breed;
    private float age;
    static private int price;

    // Setters
    Dog(String breed,float age,int price){
        this.breed = breed;
        this.price = price;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public void setPrice(int price) {
        this.price = price;
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