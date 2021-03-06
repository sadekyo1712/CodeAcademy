package com.ELearningAcademic.model;

/**
 * Created by root on 12/11/16.
 */
public class Account {

    public static final String ROLE_EMPLOYEE = "MODERATOR";
    public static final String ROLE_MANAGER = "ADMIN";
    public static final String ROLE_USER = "STUDENT";
    public static final String ROLE_TEACHER = "MENTOR";

    private String username;
    private String password;
    private boolean active;
    private String userRole;

    private String name;
    private String address;
    private String email;
    private String phone;

    public Account() {

    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "[ Account : " + this.username + ", " + this.password + ", " + this.userRole +
                ", " + this.active + ", " + this.name + ", " + this.address +
                ", " + this.email + ", " + this.phone + " ]";
    }
}
