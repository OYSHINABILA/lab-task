public class person {
    private String  name ;
    private String address ;
    private int age;

    public person(String a, String b , int c)
    {
        this.name=a;
        this.address=b;
        this.age =c;
    }
     public void setName(String  s)
     {
         this.name=s;
     }
    public void setAddress(String  s)
    {
        this.address=s;
    }
    public void setAge(int i)
    {
        this.age=i;
    }
    public String getName()
    {
        return this.name;
    }
    public String getAddress()
    {
        return this.address;
    }
    public int getAge()
    {
        return this.age;
    }
}
