import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Teacher t1 = new Teacher(101,"A","JAVA");
	    Teacher t2 = new Teacher(102,"B","DBMS");
	   Teacher t3 = new Teacher(103,"C","COA");
	   Teacher t4 = new Teacher(104,"D","DSA");
	   
	   Department d1 = new Department("Core",new Teacher[]{t2,t3});
	    Department d2 = new Department("IT",new Teacher[]{t1,t4});
	    
	   College c1 = new College("ABC",new Department[]{d1});
	
	}
}

class Teacher{
    int tid;
    String name;
    String sub;
    
    Teacher(int tid,String name,String sub){
        this.tid = tid;
        this.name = name;
        this.sub = sub;
    }
}

class Department{
    String dname;
    Teacher[] teachers;
    
    Department(String dname,Teacher[] teachers){
        this.dname = dname;
        this.teachers = teachers;
    }
}

class College{
    String cname;
    Department[] departments;
    
    College(String cname,Department[] departments){
        this.cname = cname;
        this.departments = departments;
    }
}
    
    
