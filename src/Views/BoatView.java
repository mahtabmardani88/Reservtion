package Views;

import Models.Boat;

import java.util.List;

public class BoatView {
    public void printBoat(List<Boat> Boatlist) {
        System.out.println("Boat:");
        for (Boat boat : Boatlist) {
            System.out.println(boat.toString());
        }
    }
}
