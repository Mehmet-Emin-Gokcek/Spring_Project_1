package com.assignment;

public class studentManager {

    Student student;

    public studentManager(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void print(){
        System.out.println(student);
    }

}
