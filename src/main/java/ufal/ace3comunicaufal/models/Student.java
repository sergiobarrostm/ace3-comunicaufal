package ufal.ace3comunicaufal.models;

public class Student {

    private int id, quarter;
    private String name, surname, email, course;

    public Student(int id, int quarter, String name, String surname, String email, String course) {
        this.id = id;
        this.quarter = quarter;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.course = course;
    }

    public int getID() {
        return id;
    }

    public int getQuarter() {
        return quarter;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

    public void setID (int id ) {
        this.id = id;
    }

    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourse(String course) {
        this.course = course;
    }

}
