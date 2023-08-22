public class Flower extends Plant{
    private  boolean hasSmell;
     private  boolean hasThorn;

    public Flower(String color , String name, boolean hasSmell, boolean hasThorn) {
         super(color,name);
        this.hasSmell = hasSmell;
        this.hasThorn = hasThorn;
    }

    public boolean isHasSmell() {
        return hasSmell;
    }

    public void setHasSmell(boolean hasSmell) {
        this.hasSmell = hasSmell;
    }

    public boolean isHasThorn() {
        return hasThorn;
    }

    public void setHasThorn(boolean hasThorn) {
        this.hasThorn = hasThorn;
    }

    public String toString() {
        return "Color" +getColor()+ "\nName" +getName()+"Flower" +
                "hasSmell=" + hasSmell +
                ", hasThorn=" + hasThorn;
    }
}
