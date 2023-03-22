package it.unisa.hotelProject;

import java.util.HashSet;
import java.util.Set;

public class CustomerManager {

    private Set<Customer> customerSet;

    public CustomerManager() {
        this.customerSet = new HashSet<>();
    }

    public void addCustomer(Customer customer) {
        this.customerSet.add(customer);
    }

    public void removeCustomer(Customer customer){
        this.customerSet.remove(customer);
    }

    public Set returnAllCustomers(){
        return customerSet;
    }

    public void modifyCustomer(Customer customerToModify, String phoneNumber, String creditCardNumber) throws Exception {
        for (Customer customer : customerSet) {
            if (customer.equals(customerToModify)){
                customer.setPhoneNumber(phoneNumber);
                customer.setCreditCardNumber(creditCardNumber);
            }
        }
    }
}
