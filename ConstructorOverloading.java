import java.util.*;
public class ConstructorOverloading
{
	public static void main(String[] args) {
	A a = new A(12,13);
	A a1 = new A(12,13.844);
	}
}

class A{
    int a;
    int b;
    double c;
    
    A(int a , int b){
        this.a = a;
        this.b = b;
        print();
    }
    A(int b, double c){
        this.b = b;
        this.c = c;
        print1();
    }
    void print(){
        System.out.println("Hello");
    }
    
    void print1(){
        System.out.println("Hiiii");
    }
    
}

// a) When we create a new object of any class we can also call a non-perametarized constructor
// but when we call a constructor with somr parameter  ,  it is known as Parametarized constructor
// in Constructor Overloading name of constructor is same but data type , order of data type , no. of
// parameters is different.

// Through Constructor Overloading 
// We initialize Objects through multiple way
// Valuse can be initialize directly at the time of object Creation
// We have more option to initialize our instance verial according to programmmer need

