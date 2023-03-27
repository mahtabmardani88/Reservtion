package Controllers;

import Models.Reserevtion;
import Views.ReservationView;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class ReservationController {

    private static final String RESERVATION_FILE = "reservations.json";
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ISO_OFFSET_DATE;
    private static List<Reserevtion> reservationsList;
    private static ReservationView _ReservationView;
public  ReservationController(ReservationView ReservationView){
    reservationsList = new ArrayList<>();
    _ReservationView = ReservationView;
}

    public void LoadReserevtion() {



        try (FileReader reader = new FileReader(RESERVATION_FILE)) {
            Gson gson = new Gson();

               reservationsList = gson.fromJson(reader, new TypeToken<List<Reserevtion>>(){}.getType());


        } catch (IOException e) {
            System.err.println("Error loading reservations: " + e.getMessage());
        }


    }
    public void saveReservations() {
        try (FileWriter writer = new FileWriter(RESERVATION_FILE)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(reservationsList, writer);
        } catch (IOException e) {
            System.err.println("Error saving reservations: " + e.getMessage());
        }
    }

    public void updateReservation(String updateReservtionId, String accountId, String boatId, String startTime, String endTime, String date, int priceBeforeDiscount, int discount,String paymentId) {
        LocalDate startDateTime = LocalDate.parse(startTime, DATE_FORMAT);
        LocalDate endDateTime = LocalDate.parse(endTime, DATE_FORMAT);
        LocalDate reservationDate = LocalDate.parse(date, DATE_FORMAT);
        Duration timeElapsed = Duration.between(startDateTime, endDateTime);
        long reservtime = timeElapsed.toHours();
        priceBeforeDiscount = (int)reservtime * priceBeforeDiscount;
        int totalPrice =( priceBeforeDiscount * discount) / 100;
        int deposit = (totalPrice * 25)/100;
        for (Reserevtion reservation : reservationsList) {
            if (reservation.getReservationId().equals(updateReservtionId)) {
                reservation.setAccountId(accountId);
                reservation.setBoatId(boatId);
                reservation.setStartTime(startDateTime);
                reservation.setEndTime(endDateTime);
                reservation.setDate(reservationDate);
                reservation.setDeposit(deposit);
                reservation.setPriceBeforeDiscount(priceBeforeDiscount);
                reservation.setDiscount(discount);
                reservation.setTotalPrice(totalPrice);
                reservation.setPaymentId(paymentId);
                saveReservations();
                break;
            }
        }
    }
    public void deleteReservation(String reservationId) {
        reservationsList.removeIf(reservation -> reservation.getReservationId().equals(reservationId));
        saveReservations();
    }
    public void addReservation(String accountId, String boatId, String startTime, String endTime, String date, int priceBeforeDiscount, int discount,String paymentId) {
       if (reservationsList==null){
         reservationsList =  new ArrayList<>();
       }
       String reservationId = generateReservationId();
        LocalDate startDateTime = LocalDate.parse(startTime, DATE_FORMAT);
        LocalDate endDateTime = LocalDate.parse(endTime, DATE_FORMAT);
        LocalDate reservationDate = LocalDate.parse(date, DATE_FORMAT);
        long reservtime = Duration.between(startDateTime, endDateTime).toHours();

        priceBeforeDiscount = (int)reservtime * priceBeforeDiscount;
        int totalPrice =( priceBeforeDiscount * discount) / 100;
        int deposit = (totalPrice * 25)/100;

        Reserevtion reservation = new Reserevtion(reservationId, accountId, boatId, startDateTime, endDateTime, reservationDate, deposit, priceBeforeDiscount, discount, totalPrice,paymentId);
        reservationsList.add(reservation);
        saveReservations();
    }
    public void PrintReservation(){


        _ReservationView.printReservation(reservationsList);
    }
    private static String generateReservationId() {
        // Generate unique reservation ID by counting existing reservations
        if (reservationsList == null){
            return Integer. toString(1);
        }else {
            int count = reservationsList.size() + 1;
            return Integer. toString(count);
        }

    }
}
