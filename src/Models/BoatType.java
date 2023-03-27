package Models;

public class BoatType {
    private String boatTypeId;
    private String price;

    public BoatType(String boatTypeId, String price) {
        this.boatTypeId = boatTypeId;
        this.price = price;
    }

    public String getBoatTypeId() {
        return boatTypeId;
    }

    public void setBoatTypeId(String boatTypeId) {
        this.boatTypeId = boatTypeId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "BoatType{" +
                "boatTypeId='" + boatTypeId + '\'' +
                "price='" + price + '\'' +
                '}';
    }
}
