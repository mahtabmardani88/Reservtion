package Views;

import Models.Reserevtion;
import java.util.List;

public class ReservationView {
    public void printReservation(List<Reserevtion> reserevtionList) {
        System.out.println("Reservations:");
        for (Reserevtion reserevtion : reserevtionList) {
            System.out.println(reserevtion.toString());
        }
    }
}