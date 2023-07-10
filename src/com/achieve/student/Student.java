package com.achieve.student;

public class Student {
    private int id;
    private String name;
    private String sex;
    private String course;
    private String date;
    private String password;

    public Student() {
    }

    public Student(int id, String name, String sex, String course, String dateOfAddition, String password) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.course = course;
        this.date = dateOfAddition;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
