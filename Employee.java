public class Employee  extends person{

    private String department;
    private String designation;
    public Employee(String a, String b , int c, String d, String e)
    {
        super(a, b, c);
        this.department=d;
        this.designation=e;
    }
    public void setDepartment(String  b)

    {
        this.department=b;
    }
    public void setDesignation(String  b)

    {
        this.designation=b;
    }
    public String getDepartment()
    {
        return this.department;
    }
    public String getDesignation()
    {
        return this.designation;
    }
}
