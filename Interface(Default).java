
public class Main
{
    public static void main(String[] args) {
        Test t = new Test();
        t.getValue(); // Test class ka overridden method call hoga
    }
}

interface A{

    // Java 8 se interface me default method allow hai
    // Default method ke paas body ho sakti hai
    default int getValue(){
        return 12;
    }
}

interface B{

    // A aur B dono me same default method hai
    // Isse ambiguity (Diamond Problem) create hoti hai
    default int getValue(){
        return 14;
    }
}

class Test implements A,B{

    // IMPORTANT:
    // Jab do interfaces me same default method ho,
    // to overriding compulsory hai.
    
    @Override
    public int getValue(){

        // A interface ka default method call
        System.out.println(A.super.getValue());

        // B interface ka default method call
        System.out.println(B.super.getValue());

        // InterfaceName.super.method()
        // sirf implementing class ke andar use kar sakte hain

        return 0;
    }
}

/*
IMPORTANT POINTS (HINGLISH)

1. Java 8 se interface me default method introduce hua.

2. Default method ka main purpose:
   Purane code ko break kiye bina interface me
   naye methods add karna.

3. A aur B dono me getValue() hai,
   isliye compiler confuse ho jata hai ki
   kaunsa method call kare.

4. Is situation ko Diamond Problem bolte hain.

5. Diamond Problem solve karne ke liye
   implementing class ko method override karna padta hai.

6. A.super.getValue()
   => A interface ka method call karta hai.

7. B.super.getValue()
   => B interface ka method call karta hai.

8. Agar override nahi karoge to compile-time error aayega.

9. Interface methods by default public hote hain.

10. Class method ki priority interface default method se zyada hoti hai.

Output:
12
14
*/