
public class Main
{
	public static void main(String[] args) {
		Student st = new Student(101,"abc");
		st.display();
	   Student st1 = new Student(101,"abc");
	   if(st.equals(st1)){
	   st1.display();
	   }
	}
}

final class Student{
    private int id;
    private String name;
    Student(int id,String name){
        this.id = id;
        this.name = name;
        
        
    }
    
    void display(){
      System.out.print(id+" "+name);
      IO.println();
    }
}