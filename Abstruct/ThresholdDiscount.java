package Abstruct;

public class ThresholdDiscount {

    private double discount;
    private double threshold;

    public ThresholdDiscount(double discount, double threshold) {
        this.discount = discount;
        this.threshold = threshold;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getThreshold() {
        return threshold;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }
    public double discountedPrice(double price){
        if (price<threshold){
            return price;

        }else {
            System.out.println("threshold discount is best for customer");
            return price-discount;
        }
    }
}
