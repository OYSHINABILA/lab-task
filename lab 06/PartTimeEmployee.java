public class PartTimeEmployee  extends Employee{
    public PartTimeEmployee(String a, String b , int c, String d, String e, double f, double g)
    {
        super(a, b, c,d,e);
        this.rate=f;
        this.hours=g;
    }
    private double rate;
    private double hours;
    public void setRate(double  d)
    {
        this.rate=d;
    }
    public void setHours(double  d)
    {
        this.hours=d;
    }
    public double getRate()
    {
        return this.rate;

    }
    public double getHours()
    {
        return this.hours;

    }

    public  String toString()
    {
        return "Name :"+getName()+"\nAge : " +getAge()+ "\nAddress :"+getAddress()+ " \nDepartment :"+getDepartment()+"\nDesignation :"+getDesignation()+ "\nhour:"+hours+"\nrate:"+rate;
    }

}
