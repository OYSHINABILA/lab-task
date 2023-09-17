package Registration;

public class Course {
    protected String ID;
    protected  String Title;
    protected double Credit;

    public Course(String ID, String title, double credit) {
        this.ID = ID;
        Title = title;
        Credit = credit;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public double getCredit() {
        return Credit;
    }

    public void setCredit(double credit) {
        Credit = credit;
    }
}
