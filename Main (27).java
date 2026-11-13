import java.util.*;

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.setBreed("BullDog");
        d.setAge(4.5f);
        d.setPrice(9000);

        System.out.println(d.getBreed());
        System.out.println(d.getAge());
        System.out.println(d.getPrice());
    }
}

class Dog {
    private String breed;
    private float age;
    private int price;

    // Setters
    public void setBreed(String x) {
        if(!x.isEmpty()) {
           breed = x;
        }
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