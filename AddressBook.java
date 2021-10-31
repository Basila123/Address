package com.bridgelabzAddress;

import java.util.*;

public class AddressBook {
//main class
    public static void main(String[] args) {
        Collection<ContactPerson> Co = new ArrayList<ContactPerson>();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstname = s.next();
        System.out.println("Enter your last name");
        String lastname = s.next();
        System.out.println("Enter your address");
        String address = s.next();
        System.out.println("Enter your city");
        String city = s.next();
        System.out.println("Enter your state");
        String state = s.next();
        System.out.println("Enter your zip");
        String zip = s.next();
        System.out.println("Enter your email");
        String email = s.next();
        System.out.println("Enter your phnone number");
        int phno = s1.nextInt();
        System.out.println("First name:" + firstname);
        System.out.println("Last name:" + lastname);
        System.out.println("Address:" + address);
        System.out.println("City:" + city);
        System.out.println("State:" + state);
        System.out.println("Zip" + zip);
        System.out.println("Email:" + email);
        System.out.println("Phone Number:" + phno);
    }
}


class ContactPerson {
    //instance variable
    String firstname = " ";
    String lastname = " ";
    String address = " ";
    String city = " ";
    String state = " ";
    String zip = " ";
    String email = " ";
    int phno = 0;

    //constructor
    ContactPerson(String fname, String lname, String address, String city, String state, String zip, String mail, int phno) {
        this.firstname = fname;
        this.lastname = lname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = mail;
        this.phno = phno;
    }
   //use getter to get the value
    public String getFirstname() {
        return firstname;
    }

    public String getLastnamename() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public String getState() {
        return state;
    }

    public String getEmail() {
        return email;
    }

    public int getPhno() {
        return phno;
    }

    //Over riding
    public String toString() {
        return firstname + " " + lastname + " " + address + " " + city + " " + zip + " " + email + " " + phno;
    }
}