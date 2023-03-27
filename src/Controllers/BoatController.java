package Controllers;

import Models.Boat;
import Views.BoatView;

import java.util.ArrayList;
import java.util.List;

public class BoatController {
    private static BoatView _BoatView;
    private static List<Boat> BoatList;
    public BoatController(BoatView boatView) {
        _BoatView = boatView;
        BoatList = new ArrayList<>();
    }

    public void LoadBoat(){


        BoatList.add(new Boat("1"));

        BoatList.add(new Boat("2"));


    }
    public void PrintBoat(){


        _BoatView.printBoat(BoatList);
    }
}
