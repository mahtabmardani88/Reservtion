package Models;

import java.time.LocalDate;

public class Reserevtion {
    private String reservationId;
    private String accountId;
    private String boatId;
    private LocalDate startTime;
    private LocalDate endTime;
    private LocalDate date;
    private double deposit;
    private double priceBeforeDiscount;
    private double discount;
    private double totalPrice;
    private String paymentId;

    public Reserevtion(String reservationId, String accountId, String boatId, LocalDate startTime, LocalDate endTime, LocalDate date, double deposit, double priceBeforeDiscount, double discount, double totalPrice, String paymentId) {
        this.reservationId = reservationId;
        this.accountId = accountId;
        this.boatId = boatId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.date = date;
        this.deposit = deposit;
        this.priceBeforeDiscount = priceBeforeDiscount;
        this.discount = discount;
        this.totalPrice = totalPrice;
        this.paymentId = paymentId;
    }
    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getBoatId() {
        return boatId;
    }

    public void setBoatId(String boatId) {
        this.boatId = boatId;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getPriceBeforeDiscount() {
        return priceBeforeDiscount;
    }

    public void setPriceBeforeDiscount(double priceBeforeDiscount) {
        this.priceBeforeDiscount = priceBeforeDiscount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }



    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId='" + reservationId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", boatId='" + boatId + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", date=" + date +
                ", deposit=" + deposit +
                ", priceBeforeDiscount=" + priceBeforeDiscount +
                ", discount=" + discount +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
