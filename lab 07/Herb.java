public class Herb extends  Plant{
     private boolean isMedical;
     private String season;

    public Herb(String color, String name, boolean isMedical, String season) {
        super(color, name);
        this.isMedical = isMedical;
        this.season = season;
    }

    public boolean isMedical() {
        return isMedical;
    }

    public void setMedical(boolean medical) {
        isMedical = medical;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }


    public String toString() {
        return  "Plant" + "Color" +getColor()+ "\nName" +getName()+ "Herb" + "isMedical=" + isMedical + ", season='" + season ;
    }
}
