class Employee
{
    private int empId;
    private String empName;

   
    public Employee(int empId, String empName)
    {
        this.empId = empId;
        this.empName = empName;
    }

   
    public void displayEmployee()
    {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println();
    }
}

class Department
{
    private int deptId;
    private String deptName;
    private String deptLoc;


    private Employee[] employee;


    public Department(int deptId,String deptName,String deptLoc,Employee[] employee)
    {
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptLoc = deptLoc;
        this.employee = employee;
    }


    public void displayDepartment()
    {
        System.out.println("Department ID   : " + deptId);
        System.out.println("Department Name : " + deptName);
        System.out.println("Department Loc  : " + deptLoc);

        System.out.println("\nEmployee Details:");

        for(Employee e : employee)
        {
            e.displayEmployee();
        }
    }
}

class Main
{
    public static void main(String[] args)
    {

        Employee emp1 = new Employee(18, "Sachin");
        Employee emp2 = new Employee(24, "Virat");
        Employee emp3 = new Employee(42, "XYZ");


        Employee[] emp = {emp1, emp2, emp3};


        Department dept =new Department(123,"BCCI","Dubai", emp);


        dept.displayDepartment();
    }
}
