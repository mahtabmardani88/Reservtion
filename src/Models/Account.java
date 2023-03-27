package Models;

public class Account {
    private String accountId;



    private String username;
    public Account(String accountId, String username) {
        this.accountId = accountId;
        this.username = username;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    @Override
    public String toString() {
        return "Reservation{" +
                "accountId='" + accountId + '\'' +
                ", username=" + username +
                '}';
    }
}
