public class Constructor {
   public static void main(String[] args) {
    Student s1 = new Student(); // Default Constructor
    System.out.println(s1.name); 
    Student s2 = new Student("Ram",22,109);//Parameterized Constructor
     System.out.println(s2.name); 
   } 
}
class Student{
  String name;
  int age;
  int rollNo;
  

    public Student() {

    }
    public Student(String n,int a,int rN){
        name = n;
        age = a;
        rollNo = rN;
    }

}
