package Abstruct;

public class Main {
    public static void main(String[] args) {
        PercentageDiscount p1= new PercentageDiscount(10);
        ThresholdDiscount d1= new ThresholdDiscount(1000,1000);
        BestForCustomer b1= new BestForCustomer(10,1000,500);
        System.out.println(p1.discountedPrice(5000));
        System.out.println(d1.discountedPrice(5000));
        System.out.println(b1.discountedPrice(5000));
    }
}
