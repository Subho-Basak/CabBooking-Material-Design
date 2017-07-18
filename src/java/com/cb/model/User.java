package com.cb.model;

import java.util.Calendar;

/**
 *
 * @author BASAK
 */
public class User {
    
    private String id, firstname, lastname, address, email, contact, gender, password;

    public User() {
    }

    public User(String firstname, String lastname, String address, String email, String contact, String password) {
        this.firstname = firstname.trim();
        this.lastname = lastname.trim();
        this.address = address.trim();
        this.email = email != null ? email.trim() : email;
        this.contact = contact.trim();
        this.password = password.trim();
        this.gender = null;
        this.id = generateID();
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String generateID() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(firstname.charAt(0));
        sb.append(lastname.charAt(0));
        sb.append("-");
        sb.append(String.valueOf(Calendar.getInstance().getTimeInMillis()));
        
        return sb.toString();
    }
    
    
}
