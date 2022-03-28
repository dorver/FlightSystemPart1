package BusinessLogic;

import DAO.AdministratorDAO;
import DAO.AirlineCompanyDAO;
import DAO.CustomerDAO;
import POCO.Administrator;
import POCO.AirlineCompany;
import POCO.Customer;

import java.util.List;

public class AdministratorFacade extends AnonymousFacade{

    LoginToken loginToken;
    CustomerDAO customerDAO = new CustomerDAO();
    AirlineCompanyDAO airlineCompanyDAO = new AirlineCompanyDAO();
    AdministratorDAO administratorDAO = new AdministratorDAO();

    public AdministratorFacade(LoginToken loginToken) {
        this.loginToken = loginToken;
    }

    public List get_all_customers(){
        return customerDAO.getAll();
    }

    public void add_airline (AirlineCompany airlineCompany){
        if(airlineCompany == null){
            System.out.println("Airline company is null");
            return;
        }
        Administrator administrator = administratorDAO.getAdminByUserName(loginToken.name);
        if(administrator != null){
            airlineCompanyDAO.add(airlineCompany);
        }else{
            System.out.println("Not authorized");
        }
    }

    public void add_customer (Customer customer){
        if(customer == null){
            System.out.println("Customer is null");
            return;
        }
        Administrator administrator = administratorDAO.getAdminByUserName(loginToken.name);
        if(administrator != null){
            customerDAO.add(customer);
        } else{
            System.out.println("Not authorized");
        }
    }

    public void add_administrator(Administrator administrator){
        if(administrator == null){
            System.out.println("Administrator given is null");
            return;
        }
        Administrator _administrator = administratorDAO.getAdminByUserName(loginToken.name);
        if(_administrator != null){
            administratorDAO.add(administrator);
        }else{
            System.out.println("Not authorized");
        }
    }

    public void remove_airline (AirlineCompany airlineCompany){
        if(airlineCompany == null){
            System.out.println("Airline company is null");
            return;
        }
        Administrator administrator = administratorDAO.getAdminByUserName(loginToken.name);
        if(administrator != null){
            airlineCompanyDAO.remove(airlineCompany);
        }else{
            System.out.println("Not authorized");
        }
    }

    public void remove_customer (Customer customer){
        if(customer == null){
            System.out.println("Customer is null");
            return;
        }
        Administrator administrator = administratorDAO.getAdminByUserName(loginToken.name);
        if(administrator != null){
            customerDAO.remove(customer);
        }else{
            System.out.println("Not authorized");
        }
    }

    public void remove_administrator (Administrator administrator) {
        if(administrator == null){
            System.out.println("Administrator is null");
            return;
        }
        Administrator _administrator = administratorDAO.getAdminByUserName(loginToken.name);
        if (_administrator != null) {
            administratorDAO.remove(administrator);
        }else{
            System.out.println("Not authorized");
        }
    }
}
