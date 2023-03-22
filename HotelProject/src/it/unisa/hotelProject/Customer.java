package it.unisa.hotelProject;

import java.util.InputMismatchException;
import java.util.Objects;

public class Customer {

    final private String firstname;
    final private String lastName;
    private String phoneNumber;
    private String creditCardNumber;

    public Customer(String firstname, String lastName, String phoneNumber, String creditCardNumber) throws Exception {
        this.firstname = firstname;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        if (this.isCreditCardValid(creditCardNumber)) {
            this.creditCardNumber = creditCardNumber;
        } else {
            throw new Exception("Il numero di carta di credito non è valido");
        }
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) throws Exception {
        if (this.isCreditCardValid(creditCardNumber)) {
            this.creditCardNumber = creditCardNumber;
        } else {
            throw new Exception("Il numero di carta di credito non è valido");
        }
    }

    @Override
    public String toString() {
        return firstname + ',' + lastName + ',' + phoneNumber + ',' + creditCardNumber + ";";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return firstname.equals(customer.firstname) && lastName.equals(customer.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastName);
    }

    private boolean isCreditCardValid(String creditCardNumber) {
        if (creditCardNumber.matches("[0-9]{16}")) {
            return true;
        }
        return false;
    }
}
