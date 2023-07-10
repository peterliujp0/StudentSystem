package com.achieve.subjectTable;

public class SubjectTable {
    private String subject;
    private String subjectTeacher;
    private String course;
    private int id;
    private String name;
    private String data;
    private String classroom;

    public SubjectTable() {
    }

    public SubjectTable(String subject, String subjectTeacher, String course, int id, String name, String data, String classroom) {
        this.subject = subject;
        this.subjectTeacher = subjectTeacher;
        this.course = course;
        this.id = id;
        this.name = name;
        this.data = data;
        this.classroom = classroom;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubjectTeacher() {
        return subjectTeacher;
    }

    public void setSubjectTeacher(String subjectTeacher) {
        this.subjectTeacher = subjectTeacher;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}
