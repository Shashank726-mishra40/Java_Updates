public class Main
{
	public static void main(String[] args) {
		Student st = new Student(101,"abc");
// 		st.display();
	   Student st1 = new Student(101,"abc");
	   IO.println(st==st1);
	   
	}
}

final class Student{
    private int id;
    private String name;
    private static Student obj = null;
    Student(int id,String name){
        this.id = id;
        this.name = name;
        
        
    }
    static Student  getStudent(int id, String name){
        if(obj != null && obj.name == name && obj.id == id){
            return obj;
        }
        
        obj =  new Student(id, name);
        return obj;
        
    }
    
    
    // void display(){
    //   System.out.print(id+" "+name);
    //   IO.println();
    // }
}