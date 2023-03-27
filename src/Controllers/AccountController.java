package Controllers;

import Models.Account;
import Views.AccountView;

import java.util.ArrayList;
import java.util.List;

public class AccountController {
    private static AccountView _AccountView;
    private static List<Account> AccountList;
    public AccountController(AccountView accountView) {
        _AccountView = accountView;
        AccountList = new ArrayList<>();
    }

    public void LoadAccount(){


       AccountList.add(new Account("1","user1"));

        AccountList.add(new Account("2","user2"));


    }
    public void PrintAccout(){


        _AccountView.printAccounts(AccountList);
    }
}
