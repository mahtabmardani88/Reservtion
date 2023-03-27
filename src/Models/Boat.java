package Models;

public class Boat {
    private String boatId;

    public Boat(String boatId) {
        this.boatId = boatId;
    }

    public String getBoatId() {
        return boatId;
    }

    public void setBoatId(String boatId) {
        this.boatId = boatId;
    }
    @Override
    public String toString() {
        return "Boat{" +
                "boatId='" + boatId + '\'' +
                '}';
    }
}
