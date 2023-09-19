public class Course {
    protected String ID;
    protected  String Title;
    protected int Section;

    protected double Credit;

    public Course(String ID, String title, int section, double credit) {
        this.ID = ID;
        Title = title;
        Section = section;
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

    public double getSection() {
        return Section;
    }

    public void setSection(int section) {
        Section = section;
    }

    public double getCredit() {
        return Credit;
    }

    public void setCredit(double credit) {
        Credit = credit;
    }
}
