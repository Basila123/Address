

package com.bridgelabzAddress;

import java.util.*;

public class AddressBook {
    static String name;
    static boolean is_Running = false;
    static HashMap<String, ContactInfo> addressBook = new HashMap<>();

    public static void main(String[] args) {

        AddressBook addressBookObj = new AddressBook();
        System.out.println("Welcome");
        while (!is_Running) {

            System.out.println("1 add");
            System.out.println("2 edit");
            System.out.println("0 exit");
            Scanner scanner = new Scanner(System.in);
            int ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    ContactInfo contact = new ContactInfo();
                    contact.setContactInfo();
                    name = contact.firstName.toUpperCase(Locale.ROOT) + " " + contact.lastName.toUpperCase(Locale.ROOT);
                    addressBook.put(name, contact);
                    addressBook.get(name).displayContactInfo();
                    break;

                case 2:
                    addressBookObj.editContact();
                    addressBook.get(name).displayContactInfo();
                    break;
                case 0:
                    is_Running = true;
            }
        }
    }


    public void editContact() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name and Last name  : ");
        String name = sc.nextLine().toUpperCase(Locale.ROOT);
        if (addressBook.containsKey(name)) {
            System.out.println("Enter the choice you want to edit:1.Address");
            System.out.println("2.City");
            System.out.println("3.State");
            System.out.println("4. Zipcode");
            System.out.println("5.Phone Number");
            System.out.println("6.Email");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter new Address");
                    addressBook.get(name).setAddress(sc.nextLine());
                }
                case 2 -> {
                    System.out.println("Enter new City");
                    addressBook.get(name).setCity(sc.nextLine());
                }
                case 3 -> {
                    System.out.println("Enter new State");
                    addressBook.get(name).setState(sc.nextLine());
                }
                case 4 -> {
                    System.out.println("Enter new ZipCode");
                    addressBook.get(name).setZipcode(sc.nextLine());
                }
                case 5 -> {
                    System.out.println("Enter new Phone number");
                    addressBook.get(name).setPhoneNo(sc.nextLine());
                }
                case 6 -> {
                    System.out.println("Enter new Email");
                    addressBook.get(name).setEmail(sc.nextLine());
                }
                default -> System.out.println("Please input a valid number (1-6)");
            }
        } else System.out.println("Contact not found");

    }
}

class ContactInfo {
    String firstName, lastName, address, city, state, zipcode, phoneNo, email;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }