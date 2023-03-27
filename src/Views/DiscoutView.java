package Views;

import Models.Discount;

import java.util.List;

public class DiscoutView {
    public void printDiscont(List<Discount> DiscountList) {
        System.out.println("Discount:");
        for (Discount discount : DiscountList) {
            System.out.println(discount.toString());
        }
    }
}
