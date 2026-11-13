



public class StaticKeyWord {
  public static void main(String[] args) {
   Student s1 = new Student("Shashank",20,191);
    Student s2 = new Student("Manish",20,190);
   
 // Student.school = "CMS"; // Static 

    System.out.println(s1.name +","+ s1.age+","+s1.rollNo+","+ Student.school);

    System.out.println(s2.name +","+ s2.age+","+s2.rollNo+","+ Student.school);

  }  
}
class Student{
    String name;
    int age;
    int rollNo;
    static String school = "CMS";     //YE bhi kar sakte hai

    Student(String name,int age,int rollNo){
      this.name = name;
      this.age = age;
      this.rollNo = rollNo;
    }

    // static{
    //  school = "CMS"; // Ye bhi ek tareeka hai
    // }
}
