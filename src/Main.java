import Controllers.*;
import Views.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner MainScaner = new Scanner(System.in);
        int mainChois = -1;
        while (mainChois!=0){
            System.out.println("\nChoose an option:");
            System.out.println("1. Reservtion");
            System.out.println("0. Quit");

            mainChois = MainScaner.nextInt();
            switch (mainChois){

                case 0:
                    System.out.println("Exiting program...");
                    break;
                case 1:
                    ReservationView reservationView = new ReservationView();
                    AccountView accountView = new AccountView();
                    BoatView boatView = new BoatView();
                    BoatTypeView boatTypeView = new BoatTypeView();
                    DiscoutView discoutView = new DiscoutView();
                    PaymentMethodView paymentMethodView = new PaymentMethodView();
                    ReservationController dataStore = new ReservationController(reservationView);
                    AccountController accountController = new AccountController(accountView);
                    accountController.LoadAccount();
                    BoatController boatController = new BoatController(boatView);
                    boatController.LoadBoat();
                    BoatTypeController boatTypeController = new BoatTypeController(boatTypeView);
                    boatTypeController.LoadBoatType();
                    DiscountController discountController = new DiscountController(discoutView);
                    discountController.LoadDiscount();
                    PaymentMethodController paymentMethodController = new PaymentMethodController(paymentMethodView);
                    paymentMethodController.LoadPaymentMethods();


                    dataStore.LoadReserevtion();
                  //  dataStore.PrintReservation();

                    Scanner scanner = new Scanner(System.in);
                    int choice = -1;

                    while (choice != 0) {
                        System.out.println("\nChoose an option:");
                        System.out.println("1. Add Reservetion");
                        System.out.println("2. Delete Reservetion");
                        System.out.println("3. Update Reservetion");
                        System.out.println("4. View Reservetion");
                        System.out.println("5. Calculator Reservetion");
                        System.out.println("0. Quit");

                        choice = scanner.nextInt();

                        switch (choice) {
                            case 1:
                                //give Account id from user
                                System.out.println("Enter Account Id:");
                               accountController.PrintAccout();
                                 String accountId = scanner.nextLine();
                                 //Give Boat Id From user
                                System.out.println("Enter Boat Id:");
                                boatController.PrintBoat();
                                String boatId = scanner.nextLine();
                                //give start time
                                System.out.println("Enter start time (yyyy-mm-dd HH:mm:ss): ");
                                String startTime = scanner.nextLine();
                                //give end time
                                System.out.println("Enter end time (yyyy-mm-dd HH:mm:ss): ");
                                String endTime = scanner.nextLine();
                                //give Date
                                System.out.println("Enter date (yyyy-mm-dd HH:mm:ss): ");
                                String date = scanner.nextLine();
                                //give deposit
                               // System.out.println("Enter deposit amount: ");
                               // double deposit = scanner.nextDouble();
                                //give price
                                System.out.println("Enter Boat Price:");
                                boatTypeController.PrintBoatType();
                                int priceBeforeDiscount = scanner.nextInt();
                                //give discount
                                System.out.println("Enter Discount percentage:");
                                discountController.PrintDiscont();
                                int discount = scanner.nextInt();
                                //give paymentid
                                System.out.println("Enter PaymentMethod paymentId: ");
                                String paymentId = scanner.nextLine();


                                dataStore.addReservation(accountId,boatId,startTime,endTime,date,priceBeforeDiscount,discount,paymentId);
                                System.out.println("Reservation added successfully!");
                                break;
                            case 2:
                                System.out.println("Enter Reservation Id to delete:");
                                String deletereservtionId = scanner.nextLine();
                                dataStore.deleteReservation(deletereservtionId);
                                System.out.println("Reservation deleted successfully!");
                                break;
                            case 3:

                                System.out.println("Enter Reservation Id to update:");
                                String updateReservtionId = scanner.nextLine();
                                //give Account id from user
                                System.out.println("Enter Account Id:");
                                accountController.PrintAccout();
                                String accountIdU = scanner.nextLine();
                                //Give Boat Id From user
                                System.out.println("Enter Boat Id:");
                                boatController.PrintBoat();
                                String boatIdU = scanner.nextLine();
                                //give start time
                                System.out.print("Enter start time (yyyy-mm-dd HH:mm:ss): ");
                                String startTimeU = scanner.nextLine();
                                //give end time
                                System.out.print("Enter end time (yyyy-mm-dd HH:mm:ss): ");
                                String endTimeU = scanner.nextLine();
                                //give Date
                                System.out.print("Enter date (yyyy-mm-dd HH:mm:ss): ");
                                String dateU = scanner.nextLine();
                                //give deposit
                                System.out.print("Enter deposit amount: ");
                                double depositU = scanner.nextDouble();
                                //give price
                                System.out.println("Enter Boat Price:");
                                boatTypeController.PrintBoatType();
                                int priceBeforeDiscountU = scanner.nextInt();
                                //give discount
                                System.out.println("Enter Discount percentage:");
                                discountController.PrintDiscont();
                                int discountU = scanner.nextInt();
                                //give paymentid
                                System.out.print("Enter PaymentMethod paymentId: ");
                                String paymentIdU = scanner.next();

                                dataStore.updateReservation(updateReservtionId,accountIdU,boatIdU,startTimeU,endTimeU,dateU,priceBeforeDiscountU,discountU,paymentIdU);
                                System.out.println("Reservtion updated successfully!");
                                break;
                            case 4:
                                dataStore.PrintReservation();
                                break;
                            case 0:
                                System.out.println("Back To Main...");
                                break;
                            default:
                                System.out.println("Invalid choice! Please try again.");
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;

            }



        }



    }
}