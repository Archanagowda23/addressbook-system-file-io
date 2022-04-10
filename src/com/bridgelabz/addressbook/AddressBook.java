package com.bridgelabz.addressbook;

public class AddressBook {
    private class Contact {
        String firstName, lastNmae, address, city, state, emailId;
        int zipCode;
        long mobileNumber;
    }

    /**
     * created method printContact for creating contacts in AddressBook
     */
    public void printContact() {
        Contact person = new Contact();
        person.firstName = "Archana";
        person.lastNmae = "gowda";
        person.address = "Bangalore";
        person.city = "Bangalore";
        person.state = "Karnataka";
        person.zipCode = 56699;
        person.mobileNumber = 898876667;
        person.emailId = "arch123@gmail.com";
        System.out.println("Contact Details");
        System.out.println("Name          : " + person.firstName + " " + person.lastNmae + "\n" + "Address       : "
                + person.address + "\n" + "City          : " + person.city + "\n" + "State         : " + person.state
                + "\n" + "ZipCode       : " + person.zipCode + "\n" + "MobileNumber  : " + person.mobileNumber + "\n"
                + "EmailId       : " + person.emailId + "\n");
    }

    public static void main(String[] args) {
        /**
         * created instance of AddressBook class
         */
        AddressBook addressBook = new AddressBook();
        /**
         * Calling method printContact for displaying contacts
         */
        addressBook.printContact();

    }
}
