package src.dao;

import src.model.Customer;

import java.util.Arrays;
import java.util.List;

public class CustomerDAO {

    public List<Customer> getAllCustomers(){
        return Arrays.asList(new Customer(1,"Jayesh",1),
                new Customer(2,"Nilesh",2));
    }
}
