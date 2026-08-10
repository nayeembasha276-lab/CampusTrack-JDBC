package com.example.capstonejdbc.model;

public class Student {
    private int id;
    private String name;
    private int age;
    private String course;
    private long mobile;

    public Student(){}

    public Student(int id,String name, int age, String course,long mobile) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.mobile = mobile;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("age=").append(age);
        sb.append(", id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", course='").append(course).append('\'');
        sb.append(", mobile=").append(mobile);
        sb.append('}');
        return sb.toString();
    }
}
