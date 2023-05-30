package com.kodeo.CrudRestApp.entity;

public class Student {

    // default constructor
    public Student(){

    }

    // variables
    private String firstName;
    private String lastName;

    // constructors
    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

    }

    // getter & setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
