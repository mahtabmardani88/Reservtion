package Models;

public class Discount {
    private String discountId;
    private double percentage;

    public Discount(String discountId, double percentage) {
        this.discountId = discountId;
        this.percentage = percentage;
    }

    public String getDiscountId() {
        return discountId;
    }

    public void setDiscountId(String discountId) {
        this.discountId = discountId;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    @Override
    public String toString() {
        return "Discount{" +
                "discountId='" + discountId + '\'' +
                "percentage='" + percentage + '\'' +
                '}';
    }
}
