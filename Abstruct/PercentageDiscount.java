package Abstruct;

public class PercentageDiscount implements Discountable {


    private double percentage;

    public PercentageDiscount(double percent) {
        this.percentage = percent;
    }

    public double getPercent() {
        return percentage;
    }

    public void setPercent(double percent) {
        this.percentage = percent;
    }
 public double discountedPrice(double price){
 return price-((price*percentage)/100);

 }
}
