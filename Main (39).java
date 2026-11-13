	
class Branch
{
   

    private int bid;
    private String bLoc;

   
     Branch(int bid, String bLoc)
    {
        this.bid = bid;
        this.bLoc = bLoc;
    }

   

   
    public void displayBranch()
    {
        System.out.println("Branch ID   : " + bid);
        System.out.println("Branch Loc  : " + bLoc);
    }
}


class Employee
{
    private int empId;
    private String empName;

    private Branch branch;

   
    public Employee(int empId,String empName,Branch branch)
    {
        this.empId = empId;
        this.empName = empName;
        this.branch = branch;
    }

    public void displayEmployee()
    {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);

       
        branch.displayBranch();

        System.out.println();
    }
}

class Main
{
    public static void main(String[] args)
    {
       
        Branch br = new Branch(101, "India");

       
        Employee emp1 =new Employee(18, "Sachin", br);

        Employee emp2 =new Employee(24, "Virat", br);

        Employee emp3 =new Employee(36, "Rohit", br);

        emp1.displayEmployee();
        emp2.displayEmployee();
        emp3.displayEmployee();
    }
}