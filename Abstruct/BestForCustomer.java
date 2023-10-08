package Abstruct;

import Abstruct.Discountable;
import Abstruct.PercentageDiscount;
import Abstruct.ThresholdDiscount;

public class BestForCustomer implements Discountable {
    @Override
    public double discountedPrice(double price) {

        PercentageDiscount p1=new PercentageDiscount(percentage);
        ThresholdDiscount d1= new ThresholdDiscount(threshold,discount);
        if (p1.discountedPrice(price)> d1.discountedPrice(price)){
            return d1.discountedPrice(price);
        }else {
            System.out.println("percentage price is best for customer");
           return p1.discountedPrice(price);
        }

    }

    private double percentage, threshold , discount;

    public BestForCustomer(double percentage, double threshold, double discount) {
        this.percentage = percentage;
        this.threshold = threshold;
        this.discount = discount;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public double getThreshold() {
        return threshold;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

}
