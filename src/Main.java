import BusinessLogic.AdministratorFacade;
import BusinessLogic.AirlineFacade;
import BusinessLogic.AnonymousFacade;
import BusinessLogic.CustomerFacade;
import DAO.*;
import POCO.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        User user1 = new User(4,"a", "222222","A@gmail.com", 1);
//        Customer customer1 = new Customer(2,"a","a","tel-aviv","0540000000","2222222222222222", 4);
//        Ticket ticketCustomerA = new Ticket(2,1,2);
//        Ticket ticket2CustomerA = new Ticket(3,2,2);
//        Ticket ticket3CustomerA = new Ticket(4,3,2);
//        Ticket ticket4CustomerA = new Ticket(5,4,2);
//        Ticket ticket5CustomerA = new Ticket(6,5,2);
        Ticket ticket6CustomerA = new Ticket(12, 6, 2);


        AnonymousFacade anonymousFacade = new AnonymousFacade();
//        anonymousFacade.add_customer(user1, customer1);
//        FlightDAO flightDAO = new FlightDAO();

        CustomerFacade aUser = (CustomerFacade) anonymousFacade.login("a", "222222");
        Customer customer1 = new Customer(2, "a", "a", "tel-aviv", "0543333333", "2222222222222222", 4);

//        aUser.add_ticket(ticket6CustomerA);
//        aUser.remove_ticket(ticket6CustomerA);
//        aUser.get_my_tickets(2);
//          aUser.update_customer(customer1);
        //////////////////////////////////////////////////////////////////////////////////////////
        AnonymousFacade anonymousFacade1 = new AnonymousFacade();
//        User user2 = new User(5,"b", "333333","B@gmail.com", 2);
//        AirlineCompany airlineCompany1 = new AirlineCompany(4,"Israir", 1, 5);
//
//        AirlineFacade bUser = (AirlineFacade) anonymousFacade1.login("b","333333");
//        Flight flight = new Flight(7,4,1,2, Timestamp.valueOf("2021-10-19 10:00:00"),Timestamp.valueOf("2021-10-19 22:00:00"),10);
//        bUser.add_flight(flight);
        AirlineFacade bUser = (AirlineFacade) anonymousFacade1.login("AdiYehuda", "111111");
        Flight flight = new Flight(7, 1, 1, 2, Timestamp.valueOf("2021-10-19 10:00:00"), Timestamp.valueOf("2021-10-19 22:00:00"), 10);
        //bUser.add_flight(flight);
        //bUser.remove_flight(flight);
        Flight flight1 = new Flight(8, 1, 1, 2, Timestamp.valueOf("2021-10-19 10:00:00"), Timestamp.valueOf("2021-10-19 22:00:00"), 5);
        //bUser.update_flight(flight1);
        AirlineCompany airlineCompany = new AirlineCompany(1, "EL-AL", 2, 2);
        //   bUser.update_airline(airlineCompany);
        //bUser.get_flights_by_parameters(1,2,Date.valueOf("2021-10-19"));

        ///////////////////////////////////////////////////////////////////////////////////////////////////
        AnonymousFacade anonymousFacade2 = new AnonymousFacade();

        AdministratorFacade cUser = (AdministratorFacade) anonymousFacade2.login("Moshe", "222222");
        //System.out.println(cUser.get_all_customers());

        // User user2 = new User(5,"israir", "333333","israir@gmail.com", 2);
        AirlineCompany airlineCompany1 = new AirlineCompany(5, "Israir", 1, 7);
        UserDAO userDAO = new UserDAO();
        //  userDAO.add(user2);
        // cUser.add_airline(airlineCompany1);

        //User user3 = new User(8, "c", "444444", "c@gmail.com", 2);
       // userDAO.add(user3);
        Customer customerC = new Customer(3,"c","c","ashkelon","0502222222", "5555555555555555", 8);
       // cUser.add_customer(customerC);
        //cUser.remove_airline(airlineCompany1);
        //cUser.remove_customer(customerC);
        User user4 = new User(10, "admin", "777777", "admin@gmail.com", 3);
        //userDAO.add(user4);
        Administrator administrator = new Administrator(4, "admin", "admin", 10);
        //cUser.add_administrator(administrator);
        //cUser.remove_administrator(administrator);
        User userMoshe = new User(3, "Moshe", "222222", "Moshe@gmail.com", 3);

      //  userDAO.remove(userMoshe);
        FlightDAO flightDAO = new FlightDAO();
        flightDAO.getArrivalFlights(2);
        flightDAO.getDepartureFlights(2);
    }
}
