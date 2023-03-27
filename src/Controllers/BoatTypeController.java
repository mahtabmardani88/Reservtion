package Controllers;

import Models.BoatType;
import Views.BoatTypeView;

import java.util.ArrayList;
import java.util.List;

public class BoatTypeController {
    private static BoatTypeView _BoatTypeView;
    private static List<BoatType> BoatTypeList;
    public BoatTypeController(BoatTypeView boatTypeView) {
        _BoatTypeView = boatTypeView;
        BoatTypeList = new ArrayList<>();
    }

    public void LoadBoatType(){

// you should return calculated price in this method
        BoatTypeList.add(new BoatType("1","35"));

        BoatTypeList.add(new BoatType("2","15"));


    }
    public void PrintBoatType(){


        _BoatTypeView.printBoatType(BoatTypeList);
    }
}
