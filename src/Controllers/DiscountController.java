package Controllers;

import Models.Discount;
import Views.DiscoutView;

import java.util.ArrayList;
import java.util.List;

public class DiscountController {
    private static DiscoutView _DiscontView;
    private static List<Discount> DiscontList;
    public DiscountController(DiscoutView discoutView) {
        _DiscontView = discoutView;
        DiscontList = new ArrayList<>();
    }

    public void LoadDiscount(){
//calculatur dicont if discount is valid return percentage if expire percentage set to zero

        DiscontList.add(new Discount("1",25));

        DiscontList.add(new Discount("1",10));


    }
    public void PrintDiscont(){


        _DiscontView.printDiscont(DiscontList);
    }
}
