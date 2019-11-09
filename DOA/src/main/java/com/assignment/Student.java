package com.assignment;

public class Student {

    String firstName;
    String lastName;
    String DOB;

    Address address;
    Grade grade;


    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student Info ==> \n"
                + "First Name = " + firstName + "\n"
                + "Last Name = " + lastName + "\n"
                + "Date of Birth = " + DOB + "\n"
                + "Address = " + address + "\n"
                + "Grade = " + grade ;
    }

}
