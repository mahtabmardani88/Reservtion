package Views;

import Models.Account;

import java.util.List;

public class AccountView {
    public void printAccounts(List<Account> accountList) {
        System.out.println("Account:");
        for (Account account : accountList) {
            System.out.println(account.toString());
        }
    }
}
