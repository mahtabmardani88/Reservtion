package Views;

import Models.BoatType;

import java.util.List;

public class BoatTypeView {
    public void printBoatType(List<BoatType> BoatTypelist) {
        System.out.println("BoatType:");
        for (BoatType boatType : BoatTypelist) {
            System.out.println(boatType.toString());
        }
    }
}
