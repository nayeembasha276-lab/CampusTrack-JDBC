package com.example.capstonejdbc.dao;

import com.example.capstonejdbc.model.Student;

import java.util.List;
public interface StudentDAO {
    void addStudent(Student s);
    List<Student> getAllStudents();
    Student getStudentbyId(int id);
    List<Student> searchByName(String name);

    void updateStudent(Student s);
    void updateName(int id, String name);
    void updateAge(int id, int age);
    void updateCourse(int id, String course);
    void updateMobile(int id, long mobile);

    void  deleteStudent(int id);
}
