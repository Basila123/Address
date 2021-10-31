

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
                case 3:
                    addressBookObj.deleteContact();
                case 0:
                    is_Running = true;
            }
        }
    }public void deleteContact(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first and last name of the contact you want to delete from AddressBook: ");
        String name = scanner.nextLine().toUpperCase(Locale.ROOT);
        if (addressBook.containsKey(name)) {
            addressBook.remove(name);
            System.out.println("Contact removed");
        }else
            System.out.println("Contact not found");
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

class ContactInfo{
    String firstName,lastName,address,city,state,zipcode,phoneNo,email;

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setState(String state){
        this.state=state;
    }
    public void setZipcode(String zipcode){
        this.zipcode=zipcode;
    }
    public void setPhoneNo(String phoneNo){
        this.phoneNo=phoneNo;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public void setContactInfo() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        setFirstName(sc.nextLine());
        System.out.println("Enter Last Name:");
        setLastName(sc.nextLine());
        System.out.println("Enter Address");
        setAddress(sc.nextLine());
        System.out.println("Enter City");
        setCity(sc.nextLine());
        System.out.println("Enter Zipcode");
        setState(sc.nextLine());
        System.out.println("Zipcode");
        setZipcode(sc.nextLine());
        System.out.println("Enter Phone No");
        setPhoneNo(sc.nextLine());
        System.out.println("Enter Mail");
        setEmail(sc.nextLine());
    }
    public void displayContactInfo(){
        System.out.print(" First Name: "+firstName+"\n Last Name: "+lastName+"\n Address: "+address+
                "\n City: "+city+"\n State: "+state+ "\n Zipcode: "+zipcode+"\n PhoneNO: "+phoneNo+"\n Email: "+email+"\n");
    }
}